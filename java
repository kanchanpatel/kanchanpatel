Operator Precedence
Switch Case Statements 
Looping Statements(for loop, while loop, do-while loop)
=================================================================
Operator Precedence:*
package Practice;
public class OperatorPrecedenceExample {
    public static void main(String[] args) {
        int a=10, b=20, c=30;
        int result = a+b*c/10;
        System.out.println(result);
    }
}
Explanation:
b*c (20*30) is evaluated first
The Result is divided by 10. (600/10).
Finally, a+(result) gives 70
=================================================================
Switch Case Statements:
Switch case statements are a control structure used to simplify decision making when multiple options exists
Syntax:
switch(expression){
		case value1:
			// code block
			break;
		case value2:
			// code block
			break;
		//more cases
		default:
			//default code block
}
Rules:
1. The expression can be of type int,char, String
2. The break statement exits the switch block. Without it, the flow continues to the next case
3. The default case is optional but executes when no other case matches.
=================================================================
package Practice;
public class SwitchCaseExample {
    public static void main(String[] args) {
        int day=3;
        switch(day){
            case 1:
                System.out.println("Its Monday");
                break;
            case 2:
                System.out.println("Its Tuesday");
                break;
            case 3:
                System.out.println("Its Wednesday");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
Explanation:
The day variable matches case 3, so wed is printed
the break prevents execution of further cases.
=================================================================
Looping Statements: (Looping statements are used to execute a block of code repeatedly)
Types of Loops:
1. For Loop
2. While loop
3. Do-while loop
1.For Loop
The for loop is used when the number of iterations is known.
Syntax:
for(initialization; condition; update){
	//code block
}
Example:
package Practice;
public class ForLoopExample {
    public static void main(String[] args) {
        for (int i = 1; i<=5; i++){
            System.out.println("Count: "+i);
        }
    }
}
Explanation:
Initialization: int i=1
Condition: i <= 5
Update: i++
=================================================================
2. While Loop
The while loop is used when the condition is checked before each iteration
Syntax:
while(condition){
	//code block
}
package Practice;
public class WhileLoopExample {
    public static void main(String[] args) {
        int i =1;
        while(i<= 5){
            System.out.println("Count: "+ i);
            i++;
        }
    }
}
=================================================================
3. Do-while loop
The do-while loop gurantees the execution of the loop body at least once,
Syntax:
do{
      //code block	
}while(condition);
package Practice;
public class DoWhileLoopExample {
    public static void main(String[] args) {
        int i =1;
        do {
            System.out.println("Count: "+ i);
            i++;
        }while(i<=5);
    }
}
=================================================================
Key Points:
- Use for loops when the number of interations are known
- Use while loops when the condition needs to be checked before execution
- Use do-while loops when we want the loop to execute at least once
- Use switch for multiple conditional branches.
