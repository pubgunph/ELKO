
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
 
/**
 * Getting started with text to speech
 * What voices do I have?
 * @author jmcneil
 * (c) copyright Software Pulse 2019
 *
 */
public class BasicSound {
 
 
	private static Voice[] voices;
 
	public static void main (String[]args) throws Exception{
 
		VoiceManager vm;
		// VoiceManager uses the singleton approach to creating and 
		// providing an instance
		vm = VoiceManager.getInstance();
		// Get all the voices which the VoiceManager knows about
		voices = vm.getVoices();
 
		//use Kevin voice
		Voice voice = vm.getVoice("kevin16");
		voice.allocate();
		
		voice.speak("Toll");
		
		voice.deallocate();
		
		
		/*for( Voice voice:voices ) {
			// Find out what voices are available.
			System.out.println(voice.getName() + " - " + 
			voice.getDescription());
		}*/
	}
}