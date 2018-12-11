// Output : 300

package String;

public class extract_number_from_string {

	public static void main(String[] args) {
		String msg = "You are about to delete 300 tasks.Please confirm";
		//System.out.println(msg.substring(msg.indexOf("delete")+7,msg.indexOf("tasks")-1));
		System.out.println(msg.substring(msg.indexOf("delete")+"delete".length()+1, msg.indexOf("tasks")-1));
		//System.out.println(msg.indexOf("tasks"));

	}

}
