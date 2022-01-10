import javax.swing.*;
import javax.swing.plaf.IconUIResource;

public class CGV {
    public static void main(String[] args) {
        String helloMsg = "★ 안녕하세요 CGV 입니다. ★\n";
        String menuMsg = "1. 예매하기\n2. 구매하기\n3. 포인트 조회\n4. 나가기\n";
        String ageMsg = "[청소년 구매 불가 상품]\n나이를 입력하세요";
        String films = "1. 카이 - peaches (08:00)\n2. 카이 - 전야(12:00)\n3. 카이 - Mhhh(23:00)[청소년 관람불가]\n4. 뒤로가기 ";
        int choice = 0, age = 0;
        // 사용자에게 알려줄 메세지

        /*
            // 구매하기
            1. 팝콘
            2. 콜라
            3. 맥주
            4. 뒤로가기
         */

        int pay = 0;
        String buyMsg = "1. 팝콘\n2. 콜라\n3. 맥주\n4. 뒤로가기\n";

        int money = 1_000_000_000;
        int point = 0;
        int t_price = 10000;

        boolean t_check;

        while (true){
            t_check = true;
            choice = Integer.parseInt(JOptionPane.showInputDialog(helloMsg + menuMsg));

            if(choice == 4) break;
            if(!(choice >=1 && choice <= 3)) continue;

            switch (choice){
                //예매하기 영역
                case 1:

                    if(money - t_price < 0){  // 잔액은 빼보자!
                        JOptionPane.showMessageDialog(null,"잔액이 부족합니다.");
                        continue;
                    }

                    // 변수의 재 사용 choice는 이미 위에서 다 사용 끝냈기때문.
                    choice = Integer.parseInt(JOptionPane.showInputDialog(films));
                    if(choice == 1){
                        JOptionPane.showMessageDialog(null, "카이 PEACHES 예매 완료(08:00)");
                    }else if(choice == 2){
                        JOptionPane.showMessageDialog(null, "카이 - 전야 예매 완료(12:00)");
                    }else if(choice == 3){
                        age = Integer.parseInt(JOptionPane.showInputDialog(null,"나이를 입력해주세요."));

                        if(age > 19) {
                            JOptionPane.showMessageDialog(null, "카이 - Mhhh 예매 완료(23:00)");
                        }else{
                            t_check = false;
                            JOptionPane.showMessageDialog(null, "청소년은 시청불가능합니다.");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null,"메인메뉴로 이동");
                        continue;
                    }

                    if(t_check) {
                        if(point > 0){
                            if(point - t_price >= 0){
                                point -= t_price;
                            }else{
                                money -= (t_price - point);
                                point = 0;
                            }

                        }else{
                            money -= t_price;
                            point += (int)(t_price * 0.5);
                        }
                        JOptionPane.showMessageDialog(null,"현재 잔액:"+money+"원");
                    }
                    break;
                // 구매하기 영역
                case 2:
                    // 구매 메세지가 뜬다.

                    while (true){
                        choice = Integer.parseInt(JOptionPane.showInputDialog(buyMsg));

                        if(choice == 4) break;
                        if(!(choice >= 1 && choice <= 3)) continue;

                        switch (choice){
                            case 1:
                                pay = 15000;
                                JOptionPane.showMessageDialog(null, "팝콘 구매 완료");
                                break;
                            case 2:
                                pay = 3500;
                                JOptionPane.showMessageDialog(null, "콜라 구매 완료");
                                break;
                            case 3:
                                pay = 8000;
                                JOptionPane.showMessageDialog(null, "맥주 구매 완료");
                                break;
                        }

                        if(money - pay < 0){  // 잔액은 빼보자!
                            JOptionPane.showMessageDialog(null,"잔액이 부족합니다.");
                            continue;
                        }

                        if(point > 0){
                            if(point - pay > 0){
                                point -= pay;
                            }else{
                                money -= pay - point;
                                point = 0;
                            }
                        }else{
                            money -= pay;
                            point = (int)(pay * 0.5);
                        }
                        JOptionPane.showMessageDialog(null,"현재 잔액:"+money+"원");
                    }
                    break;
                // 포인트 영역
                case 3:
                    JOptionPane.showMessageDialog(null, "현재 잔여 포인트: "+point+"원");
                    break;
            }
        }


    }
}
