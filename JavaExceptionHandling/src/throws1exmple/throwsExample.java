package throws1exmple;

public class throwsExample {
	
	public static void main(String[] args) throws Exception{
			try {
				methodA();
				
				donotCallme();
			
				
				methodB();
				
				
			}
			catch (XyzException ex) {
				// TODO: handle exception
				
				//throw ex;
			}
			catch (Exception e) {
				// TODO: handle exception
				throw e;
			}
			finally {
				//: handle finally clause
				
				System.out.println("\nInside finally block");
			}
			
			System.out.println("end of the main method ");
		}

	private static void methodA() {
		// TODO Auto-generated method stub
		
		System.out.println("inside in method A");
		
		
		}

		
	private static void methodB() throws XyzException {
		// TODO Auto-generated method stub
		System.out.println("inside in method B");
		
		throw new XyzException();
		
		
	}



	private static void donotCallme() throws Exception {
		// TODO Auto-generated method stub
	
		
		throw new Exception("you don't call this method");
		
	}
	
	



	}



