package cn.li.pojo;

import java.io.Serializable;
/**
 *  
 * ClassName:User
 * Package:cn.li.pojo
 * Description:
 * @Date:2019年7月1日 下午5:06:02
 * @Author:cn.li
 */
public class User implements Serializable{
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private int id;
		private String username;
		private String password;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
}
