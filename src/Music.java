 enum Note {
    MIDDLE_C, C_SHARP, B_FLAT; // Etc.
}
class Instrument {
    public void play(Note n) {
        System.out.print("Instrument.play()");
    }
}

class Wind extends Instrument {
    // Redefine interface method:
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }}

public class Music {
    public static void tune(Instrument i) {

        i.play(Note.MIDDLE_C);
    }
    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute); // Upcasting
    }
}