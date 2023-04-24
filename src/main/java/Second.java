import java.util.ArrayList;
import java.util.Random;

public class SeconTask {

    //// 2. Пусть дан произвольный список целых чисел, удалить из него чётные числа

    public class Second {

        public static Integer RandomNums(int n) {
            Random random = new Random();
            int myRandomNumber = random.nextInt(n);
            return myRandomNumber;
        }
        public static ArrayList RandomArray(int n) {
            ArrayList arrayList = new ArrayList();
            int count = n;
            while (count!=0){
                int digit = RandomNums(n);
                arrayList.add(digit);
                count--;
            } return arrayList;
        }
        public static ArrayList DeleteEvens(ArrayList arrayList){
            for (int i = 0; i < arrayList.size(); i++) {
                int num = (int)arrayList.get(i);
                if (num%2==0){
                    arrayList.remove(i);}
            }
            return arrayList;
        }
    }

}
