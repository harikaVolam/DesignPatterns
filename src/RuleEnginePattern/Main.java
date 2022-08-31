package RuleEnginePattern;


//This pattern can be used to avoid multiple if else statements
//and use different strategies based on multiple conditions
//we can go for strategy pattern also in this case but matches method in rules makes a big difference from strategy pattern because we can different conditions there
public class Main {


    public static void main(String[] args) {

        RuleEngine ruleEngine = new RuleEngine();
        ruleEngine
                .registerRule(new IPhone())
                .registerRule(new AndroidPhone())
                .registerRule(new WindowsPhone());

        Phone androidPhone = new Phone(Phone.OSType.WINDOWS);
        Phone phone = ruleEngine.rule(androidPhone);

        System.out.println("Output Phone: " + phone);


    }



}
