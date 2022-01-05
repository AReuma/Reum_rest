public class MyCat {
    // 고양이 나이
    // 고양이 몸무게

    String name;
    int age;
    float weight;

    public void initCat(String name, float weight, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    private void feed(){
        System.out.println("사료를 먹습니다.");
        weight += 0.1f;

        System.out.println("운동을 하셔야 합니다. ");
    }

    private void training(){
        weight -= 0.1f;

        System.out.println("살이 빠졌습니다. ");
    }

    public void warningMessage(){
        System.out.println("냥냥!");

        if(weight > 8){
            System.out.printf("%s는 무거운 고양이야!(%.1f)",name,weight);
        }else if(weight < 6){
            System.out.printf("%s는 가벼운 고양이야!(%.1f)",name,weight);
        }else
            System.out.printf("%s는 정상 고양이야!(%.1f)",name,weight);
    }

    private  int getRandomPattern(){
        return (int)(Math.random()*2 +1);
    }

    int scheduleNum;
    public void simulation(){
        boolean endFlag = false;
        int cnt = 0;

        while (true){
            System.out.println(" 오늘은 뭘 할까요?(하루에 3가지 일과)");

            for( int i = 0; i < 3; i++){
                scheduleNum = getRandomPattern();

                switch (scheduleNum){
                    case 1:
                        feed();
                        break;
                    case 2:
                        training();
                        break;
                }

                warningMessage();
                cnt++;

                if(cnt > 365){

                }

            }
        }
    }
}
