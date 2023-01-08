import java.util.*;

public class SonTopishOyini {
    public static void main(String[] args) {
        for (int j = 1; j <=1;) {
            try {
                int step = -1;
                int yut = 0;
                int yutqaz = 0;
                while (step != 0) {
                    System.out.println("0=exit,1=Start game,2=My score");
                    Scanner scanners= new Scanner(System.in);
                    step = scanners.nextInt();
                    switch (step) {
                        case 0:
                            break;
                        case 1:
                            try {
                                Scanner scanner = new Scanner(System.in);
                                Random random = new Random();
                                int a = random.nextInt(1, 10);
                                System.out.println(a);
                                int q;
                                System.out.println("3ta urunishiz bor");
                                for (int i = 1; i <= 3; i++) {
                                    System.out.println("Kopmyuter o`ylagan sonni toping");
                                    q = scanner.nextInt();
                                    if (a == q) {
                                        System.out.println("Yuttingiz🤴🤴🤴");
                                        yut++;
                                        break;
                                    } else if (a > q) {
                                        System.out.println("siz kiritgan son kichik");
                                        if (3 - i != 0) {
                                            System.out.println(3 - i + " ta urunishiz bor");
                                        } else {
                                            System.out.println("yutqazdingiz😪😪😪");
                                            yutqaz++;
                                        }
                                    } else {
                                        System.out.println("siz kiritgan son katta");
                                        if (3 - i != 0) {
                                            System.out.println(3 - i + " ta urunishiz bor");
                                        } else {
                                            System.out.println("yutqazdingiz😪😪😪");
                                            yutqaz++;
                                        }
                                    }
                                }
                            } catch (Exception r) {
                                System.out.println("harfmas son kirit");
                            }
                            break;
                        case 2:
                            System.out.println("Yutganingiz:\t" + yut);
                            System.out.println("Yutqazganingiz:\t" + yutqaz + "\n");
                            break;
                        default:
                            System.out.println("bizda bunaqa buyruq yo`q");
                            break;
                    }
                }
                j++;
            }catch (Exception e) {
                System.out.println("harfmas son kirit");
            }
        }
    }
}
