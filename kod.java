public class Sample {
// 3 basamaklı armstrong sayıları
public static void main(String[] args) {
int i, temp, cubeSum, digit;
i = 100;
while (i < 1000) {
temp = i;
cubeSum = 0;
do {
digit = temp % 10;
cubeSum += digit * digit * digit;
temp /= 10;
} while (temp != 0);
if (i == cubeSum)
System.out.println(i);
i++;
}
}
}
