import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        // system.in 키보드를 통해서 데이터를 입력받는 스캐너

        String name ="";
        System.out.println("이름을 입력하세요.");

        name = myScanner.nextLine();
        // next와 nextLine의 차이점은?
        // >> 둘다 문자열을 입력받으나 next()는 띄어쓰기전, nextLine() 한줄 전체를 입력받는다.
        // >> nextLine() 키보드 버퍼가 비어있을 경우 입력을 요구하며 대기하고
        // >> 키보드 버파가 비어있지 않으면 키보드 전체의 내용을 불러 읽어들인다.

        int age = 0;
        System.out.println("나이를 입력해라");
        age = myScanner.nextInt();
        myScanner.nextLine(); //이것을 통해 키보드 버퍼를 비워준다.

        String addr = "";

        // 여기서 사는곳을 묻지 않고 끝이 나 버린다.
        // 그 이유는 버퍼에 엔터가 남아있기 때문이다.

        //문자열을 제외한 데이터를 입력받은 후 nextLine()메소드가 실행이 되야 한다면 키보드 버퍼의 엔터키를 읽어들이는 문제 발생
        // 문자열을 제외한 데이터를 입력받은 후 키보드 버프를 비워즈는 동작을 실행하고 nextLine() 메소드를 실행한다.
        System.out.println("사는 곳은?");
        addr = myScanner.nextLine();
        System.out.println(name+"의 나이는"+age+" 사는 곳은 "+addr+"입니다.");
    }
}
