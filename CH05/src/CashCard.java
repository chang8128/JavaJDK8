class CashCard {
    private String number;  //1. 使用 private 定义私有成员
    private int balance;    //1. 使用 private 定义私有成员
    private int bonus;      //1. 使用 private 定义私有成员
    CashCard(String number, int balance, int bonus) {
        this.number = number;
        this.balance = balance; 
        this.bonus = bonus;
    }

    void store(int money) {  //2. 储值调用的方法，不会返回值；因为声明了 private number, private balance, 要修改 balance，就一定得通过store()定义的流程；
        if(money > 0) {
            this.balance += money;
            if(money >= 100) {
                this.bonus++;
            }
        }
        else {
            System.out.println("储值是负数？你是乱来的吗？");
        }
    }

    void charge(int money) {  //扣款时调用的方法
        if(money > 0) {
            if(money <= this.balance) {
                this.balance -= money;
            }
        }
        else {
            System.out.println("钱不够啦！");
        }
    }

    int exchange(int bonus) {  //兑换点数时调用的方法，会返回 int 型态
        if(bonus > 0) {
            this.bonus -= bonus;
        }
        return this.bonus;
    }

    int getBalance() {  //3. 因为定义了private, 以及签署store() 方法，这里就得提供取值方法成员
        return balance;
    }

    int getBonus() {  //3. 因为定义了private, 以及签署store() 方法，这里就得提供取值方法成员
        return bonus;
    }

    String getNumber() {  //3. 因为定义了private, 以及签署store() 方法，这里就得提供取值方法成员
        return number;
    }
}
