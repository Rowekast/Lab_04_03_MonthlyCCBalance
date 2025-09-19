//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    double creditCardBalance = 5000.00;
    double interestRate = 0.17; // 18% annual monthlu rate
    double oneMonthBalance = creditCardBalance + creditCardBalance * interestRate ;
    double twoMonthBalance = oneMonthBalance + oneMonthBalance * interestRate;
    System.out.println("Your credit card balance after one month is " + oneMonthBalance);
    System.out.println("Your credit card balance after two months is " + twoMonthBalance);

}
