package example.openal;

import club.doki7.ffm.library.ISharedLibrary;
import club.doki7.ffm.ptr.IntPtr;
import club.doki7.openal.AL;
import club.doki7.openal.ALC;
import club.doki7.openal.ALLoader;
import club.doki7.openal.handle.ALCcontext;
import club.doki7.openal.handle.ALCdevice;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.*;

public class CannonInD {
    public static void main(String[] args) {
        String code = (
                "A5 #F5- G5- A5 #F5- G5- A5- A4- B4- #C5- D5- E5- #F5- G5- "
                + "#F5 D5- E5- #F5 #F4- G4- A4- B4- A4- G4- A4- #F4- G4- A4- G4 "
                + "B4- A4- G4 #F4- E4- #F4- E4- D4- E4- #F4- G4- A4- B4- "
                + "G4 B4- A4- B4 #C5- D5- A4- B4- #C5- D5- E5- #F5- G5- A5-"
        );
        List<double[]> sequence = transformNoteSequence(code, 0.3);
        int[] pcm = genSinWaveSequence(sequence);
        playPCM(pcm);
    }

    public static List<double[]> transformNoteSequence(String notes, double basicDurationInSeconds) {
        List<double[]> result = new ArrayList<>();
        String[] repsList = notes.trim().split("\\s+");

        for (String reps : repsList) {
            int plus = reps.length() - reps.replace("+", "").length();
            int minus = reps.length() - reps.replace("-", "").length();
            int dot = reps.length() - reps.replace(".", "").length();

            double duration = basicDurationInSeconds * pow(2.0, plus - minus) * pow(1.5, dot);

            int octave = 4;
            for (char ch : reps.toCharArray()) {
                if (Character.isDigit(ch)) {
                    octave = Character.getNumericValue(ch);
                    break;
                }
            }

            String note;
            if (reps.startsWith("#") || reps.startsWith("b")) {
                note = reps.substring(0, 2).toLowerCase();
            } else {
                note = String.valueOf(reps.charAt(0)).toLowerCase();
            }

            int noteFreqBase = switch (note) {
                case "c", "#b" -> 0;
                case "#c", "bd" -> 1;
                case "d" -> 2;
                case "#d", "be" -> 3;
                case "e", "bf" -> 4;
                case "f", "#e" -> 5;
                case "#f", "bg" -> 6;
                case "g" -> 7;
                case "#g", "ba" -> 8;
                case "a" -> 9;
                case "#a", "bb" -> 10;
                case "b", "bc" -> 11;
                default -> throw new IllegalArgumentException("Unknown note: " + note);
            };

            double frequency = 261.63 * pow(2.0, noteFreqBase / 12.0 + (octave - 4));
            result.add(new double[]{frequency, duration});
        }

        return result;
    }

    public static int[] genSinWaveSequence(List<double[]> sequence) {
        List<Integer> result = new ArrayList<>();
        for (double[] pair : sequence) {
            double frequency = pair[0];
            double duration = pair[1];
            for (int val : genSinWave(frequency, duration)) {
                result.add(val);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }

    public static int[] genSinWave(double frequency, double duration) {
        int sampleRate = 44100;
        float amplitude = 0.5f;
        double fadeTime = 0.01;

        int samples = (int)(sampleRate * duration);
        int fadeSamples = Math.min((int)(sampleRate * fadeTime), samples / 2);
        int[] bufferData = new int[samples];

        for (int i = 0; i < samples; i++) {
            double time = i / (double)sampleRate;
            double raw = sin(2.0 * Math.PI * frequency * time);

            double envelope;
            if (i < fadeSamples) envelope = i / (double)fadeSamples;
            else if (i > samples - fadeSamples) envelope = (samples - i) / (double)fadeSamples;
            else envelope = 1.0;

            double value = amplitude * raw * envelope;
            bufferData[i] = (int)(value * 32767);
        }

        return bufferData;
    }

    public static void playPCM(int[] bufferData) {
        try (Arena arena = Arena.ofConfined()) {
            ALC alc = ALLoader.loadALC(libOpenAL);
            AL al = ALLoader.loadAL(libOpenAL);

            ALCdevice device = alc.openDevice(null);
            ALCcontext context = alc.createContext(device, null);
            alc.makeContextCurrent(context);

            IntPtr buffer = IntPtr.allocate(arena);
            IntPtr source = IntPtr.allocate(arena);
            al.genBuffers(1, buffer);
            al.genSources(1, source);

            MemorySegment segment = IntPtr.allocate(arena, bufferData).segment();
            al.bufferData(buffer.read(), AL.FORMAT_MONO16, segment, bufferData.length * 4, 44100);
            al.sourcei(source.read(), AL.BUFFER, buffer.read());
            al.sourcePlay(source.read());

            IntPtr state = IntPtr.allocate(arena);
            do {
                al.getSourcei(source.read(), AL.SOURCE_STATE, state);
            } while (state.read() == AL.PLAYING);

            al.deleteSources(1, source);
            al.deleteBuffers(1, buffer);
            alc.makeContextCurrent(null);
            alc.destroyContext(context);
            alc.closeDevice(device);
        }
    }

    private static final ISharedLibrary libOpenAL = ALLoader.loadOpenALLibrary();
}
