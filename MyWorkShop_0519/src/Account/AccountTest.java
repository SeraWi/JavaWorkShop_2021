package Account;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.security.auth.login.AccountNotFoundException;

public class AccountTest {    
    public static void main( String[] args ) {        
        int menu  = 0;
        Account acc = null;
        
        while ( menu != 9 ) {      
        	int money;
            printMenu();            
            try {                
                menu = Integer.parseInt(getUserInput());                
                //TODO �� �޴� ���� �� �ؾ� �� �� ����
                switch ( menu ) {
                case 1:     // ���� ����
                    System.out.print( "\n���¹�ȣ : " );
                    String account=getUserInput();
                    System.out.print( "������ : " );
                    String name = getUserInput();
                    System.out.print( "���� �Ա� : " );
                    int balance = Integer.parseInt(getUserInput());
                    acc= new Account(account,name,balance);
                    
                    break;
                case 2:     // ���� ���� ���
                	if( acc == null) {
                		throw new AccountNotFoundException("[����]���°� �������� �ʽ��ϴ�.");
                	}else {
                		System.out.println(acc);
                	}
                    break;
                case 3:     // �Ա�
                    System.out.print( "�Ա��� �ݾ� : " );
                    money = Integer.parseInt(getUserInput());
                    if( acc == null) {
                		throw new AccountNotFoundException("[����]���°� �������� �ʽ��ϴ�.");
                	}
                    acc.deposit(money);
                    break;
                case 4:     // ���
                    System.out.print( "����� �ݾ� : " );
                    money = Integer.parseInt(getUserInput());
                    if( acc == null) {
                		throw new AccountNotFoundException("[����]���°� �������� �ʽ��ϴ�.");
                	}
                    acc.withdraw(money);
                    break;
                case 9:     // ����
                    System.out.println( "�����մϴ�." );
                    break;
                default:
                    System.out.println( "[����] �޴��� �߸� �Է��Ͽ����ϴ�." );
                    break;
                }
                
                //TODO catch ����ȭ (������ ���� ��Ȳ ����)
            }catch(InvalidValueException e) {
            	System.out.println(e.getMessage());
            }catch (AccountNotFoundException e) {
                System.out.println(e.getMessage());
            }catch(Exception e) {
            	
            }
        }
    }
    
    private static void printMenu() {
        System.out.println( "\n===== < �޴� > =====" );
        System.out.println( " 1. ���� ����" );
        System.out.println( " 2. ���� ���� ���" );
        System.out.println( " 3. �Ա�" );
        System.out.println( " 4. ���" );
        System.out.println( " 9. ����" );
        System.out.println( "===================" );
        System.out.print( ">> �޴� : " );
    }
    
    public static String getUserInput() {        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputString = null;
        
        try {
            inputString = br.readLine();
        } catch ( IOException e ) {
            e.printStackTrace();
        }
        return inputString;
    }
}