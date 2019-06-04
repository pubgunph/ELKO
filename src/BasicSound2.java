
 
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
 
/**
 * Getting started with text to speech
 * Accessing those tricky mbrola voices
 * @author jmcneil
 * (c) copyright Software Pulse 2019
 *
 */
public class BasicSound2 {
	private static Voice[] voices;
 
	public static void main (String[]args) throws Exception{
 
		System.setProperty("mbrola.base", "C:\\Users\\lukas\\Documents\\Voices");
		VoiceManager vm;
		// VoiceManager uses the singleton approach to creating and 
		// providing an instance
		vm = VoiceManager.getInstance();
		// Get all the voices which the VoiceManager knows about
		voices = vm.getVoices();
 
		for( Voice voice:voices ) {
			// Find out what voices are available.
			System.out.println(voice.getName() + " - " + 
			voice.getDescription());
		}
 
	}
 
}