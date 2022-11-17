public class SimpleArray {
    public static void main(String[]args){
        String[] musicBands = new String[5];
        musicBands[0] = "Rumjacks";
        musicBands[1] = "Dropkick Murphys";
        musicBands[2] = "Flogging Moly";
        musicBands[3] = "The Pogues";
        musicBands[4] = "The Real Mackenzies";
        String musicBand = musicBands[3];
        System.out.println(musicBands[3]);
        int numberOfElements = musicBands.length;
        System.out.println("Moja tablica zawiera "  + musicBands.length +    " elementów");

    }
}
