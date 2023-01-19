package exercises;

public class HackerDili {
      /*
          Interwiew
          Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren kodu yazınız.
          Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar.
           Genellikle çevirdikleri harfler şu şekilde:
              s -> 5
              a -> 4
              e -> 3
              i -> 1
              o -> 0
          OUTPUT :
           hackerDili("java ile hersey guzel")
           h4ck3rd1l1("j4v4 1l3 h3r53y guz3l")
     */

    public static void main(String[] args) {
        String s = "java ile hersey guzel";
        StringBuilder hackerS = new StringBuilder();
        String[] arr = s.split("");

        int idx = 0;
        for (String w : arr) {

            switch (w) {
                case "s":
                    arr[idx] = "5";
                    break;
                case "a":
                    arr[idx] = "4";
                    break;
                case "e":
                    arr[idx] = "3";
                    break;
                case "i":
                    arr[idx] = "1";
                    break;
                case "o":
                    arr[idx] = "0";
                    break;
            }
            hackerS.append(arr[idx]);
            idx++;
        }
        System.out.println(hackerS);
    }
}
