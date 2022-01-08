public class MethodTask {
    // 홀수를 짝수로 바꿔주는 메서드
    // 1부터 내가 입력한 정수까지의 누적합 구해주는 메서드
    // 두 정수의 나누셈 메서드
    // 정수를 한글로 바꿔주는 메서드 // 1024, 일공이사

    int change(int num){
        if(num % 2 == 0){
            System.out.println("짝수가 들어왔습니다.");
        }else
            System.out.println("홀수가 들어왔습니다.");

        return num+1;
    }

    void getSumFrom1(int end){
        int result = 0;
        if(end > 1) {
            for (int i = 1; i < end+1; i++) {
                result += i;
            }
            System.out.println(result);
        }else
            System.out.println("1보다 큰 수를 입력하세요");

        // 여기서 리턴값이 필요한가?
        // -> 아니 리턴값을 받아서 처리가 필요하지않다.
        //    그래서 그냥 출력을 해주자.
    }

    void div(int num1, int num2){
        double result = 0;
        if(num2 != 0){
            result = Double.parseDouble(String.format("%.3f",(double) num1/num2));
            System.out.println(result);
        }else
            System.out.println("0으로 나눌 수 없습니다.");

    }

    //정수를 한글로 바꾸는 메서드
    void changeToHangle(String data){
        String hangle = "공일이삼사오육칠팔구";
        String result = "";

        for(int i = 0; i< 10; i++){
            System.out.println(hangle.charAt(i));
        }

        int num = Integer.parseInt(data);
        System.out.println(num);
        for(int i = 0; i < data.length(); i++){
           result += hangle.charAt(num % 10);
           num /= 10;
        }

        for(int i = data.length()-1; i > -1; i--){
            System.out.print(result.charAt(i));
        }

    }

    public static void main(String[] args) {
        MethodTask mt = new MethodTask();

        System.out.println(mt.change(3));
        mt.getSumFrom1(10);

        mt.div(10, 5);

        mt.changeToHangle("1024");

    }


}
