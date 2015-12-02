package singleton;


/**
 * ���ʵۡ��࣬�ʵ�ֻ��һ��
 * @author barcelona
 *
 */
public class Emperor {

	/**
	 * Singelonģʽ��Ĺ��캯������Ϊ˽�л�
	 */
	private Emperor() {
		// TODO Auto-generated constructor stub
	}
	
	
	private static Emperor emperor = null;
	
	public static synchronized Emperor getEmperor() {
		
		/**
		 * ������
		 */
		if ( emperor == null ) {
			
			emperor = new Emperor();
		}
			
		return emperor;
	}
	
}
