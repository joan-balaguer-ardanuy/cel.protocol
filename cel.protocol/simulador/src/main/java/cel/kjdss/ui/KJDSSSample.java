package cel.kjdss.ui;
/**
 * Project: KJ DSS
 * File   : KJDSSSample.java
 *
 * Author : Kristofer Fudalewski
 * Email  : sirk_sytes@hotmail.com   
 * Website: http://sirk.sytes.net
 */

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.HeadlessException;
import java.io.File;
import java.util.Vector;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.SourceDataLine;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileFilter;

import cel.kjdss.KJDigitalSignalSynchronizer;


/**
 * @author Kris Fudalewski
 *
 * Sample application demonstrating KJDSS 
 */
public class KJDSSSample extends JFrame implements KJDSS_Saturation_Listener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1863833558895428247L;

	private static final int READ_BUFFER_SIZE = 1024 * 4;
	
	private KJDigitalSignalSynchronizer dss;
	
	private Vector<KJDSS_Saturation_Listener> listeners = null;
	
	public synchronized void add_KJDSS_Saturation_Listener(KJDSS_Saturation_Listener listener)
	{
		listeners.add(listener);
	}

	public synchronized void remove_KJDSS_Saturation_Listener(KJDSS_Saturation_Listener listener)
	{
		listeners.remove(listener);
	}
	
	protected void fire_KJDSS_Saturation_Event(KJDSS_Saturation_Event event)
	{
		for (KJDSS_Saturation_Listener listener : listeners) {
			listener.on_Saturation_Event(event);
		}
	}
	
	public KJDSSSample() throws HeadlessException 
	{
		super();
		listeners = new Vector<KJDSS_Saturation_Listener>();
	}
	
	public void Start_KJDS()
	{
		initGUI();
		
		initDSS();
		
        setVisible( true );
        
        mainLoop();	
	}
    
	private void initDSS() {
		
		// -- Create a DSS.
		dss = new KJDigitalSignalSynchronizer();
		
		// -- Create DSP that comes with KJDSS (also used in KJ).
		KJScopeAndSpectrumAnalyzer wDsp = new KJScopeAndSpectrumAnalyzer();
		
		wDsp.add_KJDSS_Saturation_Listener(this);
		
		// -- Add DSP to DSS.
		dss.add( wDsp );
		
		// -- Add DSP as component to JFrame
        add( (Component)wDsp );
		
	}
	
	private void initGUI() {
		
		setTitle( "KJDSS - Sample" );

		setLayout( new BorderLayout() );
		
        setSize( 456, 208 );
        
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        
	}
	
	private void mainLoop() {
		
		while( true ) {
		
			// -- Choose a WAV file.
			File wWavFile = chooseFile();

			// -- Play the chosen WAV file, otherwise exit.
			if ( wWavFile != null ) {
				playFile( wWavFile );
			} else {
				break;
			}
			
		}
		
		System.exit( 0 );
		
	}
	
	private void playFile( File pWavFile ) {
		
        try {
	        
        	// -- Load the WAV file.
            AudioInputStream wAs = AudioSystem.getAudioInputStream( pWavFile );
            
            // -- Create a source data line in the format of the file.
        	SourceDataLine wSdl = AudioSystem.getSourceDataLine( wAs.getFormat() );

        	// -- Open the source data line and start it.
        	wSdl.open();
        	wSdl.start();

        	// -- Have the DSS monitor the source data line.
            dss.start( wSdl );
        	
            // -- Allocate a read buffer.
        	byte[] wRb = new byte[ READ_BUFFER_SIZE ];
        	int    wRs = 0;
        	
        	// -- Read from WAV file and write to DSS (and the monitored source data line)
        	while( ( wRs = wAs.read( wRb ) ) != -1 ) {
        		dss.writeAudioData( wRb, 0, wRs );
        	}

        	// -- EOF, stop monitoring source data line.
        	dss.stop();
        	
        	// -- Stop and close the source data line.
        	wSdl.stop();
        	wSdl.close();
            
        } catch( Exception pEx ) {
        	pEx.printStackTrace();
        }
		
	}
	
	
	private File chooseFile() {
		
		JFileChooser wFc = new JFileChooser();
		
		wFc.setFileFilter( 
			new FileFilter() {

				@Override
				public boolean accept( File pFile ) {
					return pFile.getName().toLowerCase().endsWith( ".wav" ) || pFile.isDirectory();
				}

				@Override
				public String getDescription() {
					return "*.wav";
				}
				
			}
		);
		
		wFc.setMultiSelectionEnabled( false );
		
		wFc.showOpenDialog( this );
		
		return wFc.getSelectedFile();
		
	}
	
	
//	public static void main( String[] pArgs ) {
//		new KJDSSSample();
//	}

	@Override
	public void on_Saturation_Event(KJDSS_Saturation_Event event) {
		// TODO Auto-generated method stub
//		System.out.println("\n SATURATION " + String.valueOf(i));
//		i++;
//		
//		System.out.println("\n startFrequency: " + String.valueOf(event.getBand().startFrequency));
//		System.out.println("\n endFrequency: " + String.valueOf(event.getBand().endFrequency));
//		System.out.println("\n Frequency: " + String.valueOf(event.getBand().frequency));
//		System.out.println("\n Distribution: " + String.valueOf(event.getBand().distribution));
//		
//		System.out.println("\n");
		
		KJDSS_Saturation_Event event2 = new KJDSS_Saturation_Event(this);
		event2.setEventType(event.getEventType());
		event2.setBand(event.getBand());
		fire_KJDSS_Saturation_Event(event2);	
	}

}
