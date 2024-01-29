package day25_Review;

public class C05_Frequency {
    public static void main(String[] args) {
        String str ="Alabama'da alabalık avlamak yasak mı?";
        frequency(str,'a');
    }

    // Verilen bir stringte belli bir hatfin kaç tane olduğunu yazdıran  metod
    // "CCCFFDCFDF"   - C 4
    // Büyük küçük harf duyarlı

    public static void frequency(String word, char ch){
        int frequency = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i)==ch){
                frequency++;
            }
        }

        System.out.println(ch+"--->"+frequency);
    }
}
