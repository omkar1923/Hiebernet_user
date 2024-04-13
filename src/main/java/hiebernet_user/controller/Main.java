package hiebernet_user.controller;

import java.util.Scanner;

import hiebernet_user.dao.UserDao;
import hiebernet_user.dto.User;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		UserDao dao = new UserDao();
		System.err.println("Welcome");
		System.out.println("enter \n1.Resister \n2.Login");
		Boolean isLogin = false;
		switch (scanner.nextInt()) {
		case 1: {
			User user = new User();
			System.out.println("Enter the id");
			user.setId(scanner.nextInt());
			System.out.println("enter the name");
			user.setName(scanner.next());
			System.out.println("enter the phone");
			user.setPhone(scanner.nextLong());
			System.out.println("enter the email");
			user.setEmail(scanner.next());
			System.out.println("enter password");
			user.setPassword(scanner.next());

			Boolean isPersent = dao.resister(user);
			if (isPersent) {
				System.out.println("user resistered succesfully");
			} else {
				System.err.println("error occured user unable to resister");
			}

		}

			break;
		case 2: {
			System.out.println("enter email");
			String email = scanner.next();
			System.out.println("enter password");
			String password = scanner.next();
			User dbPassword = dao.login(email);
			if (dbPassword != null) {
				if (password.equals(dbPassword.getPassword())) {
					System.out.println("user Login successfully");
					isLogin = true;
				} else {
					System.err.println("invalid password");
				}
			} else {
				System.err.println("invalid email provided");
			}
			if (isLogin) {
				System.out.println("1.to view password \n2.to update password");
				switch (scanner.nextInt()) {
				case 1: {
					User user = dao.login(email);
					System.out.println("User ID: " + user.getId());
		            System.out.println("Facebook Password: " + user.getFbpassword());
		            System.out.println("Instagram Password: " + user.getInstpasswword());
		            System.out.println("Snapchat Password: " + user.getSnapchatpassword());
		            System.out.println("X Password: " + user.getXpassword());

				}
				case 2: {
					System.out.println(
							"1.to update fbPassword \n2.update instaPassword \n3.update Snapchat password \n4.to update x password");
					switch (scanner.nextInt()) {
					case 1: {
						System.out.println("enter fbPassword");
						String fbPassword = scanner.next();

						User user = dao.updateFB(email, fbPassword);
						if (user != null) {
							System.out.println("data updated successfully");
							System.out.println("password updated is" + user.getFbpassword());
						}
					}
					case 2: {
						{
							System.out.println("enter fbPassword");
							String instaPassword = scanner.next();

							User user = dao.updateInsta(email, instaPassword);
							if (user != null) {
								System.out.println("data updated successfully");
								System.out.println("password updated is" + user.getInstpasswword());
							}
						}
					}
					case 3: {

						{
							System.out.println("enter SnapChatPassword");
							String snapChat = scanner.next();

							User user = dao.updateSnapChat(email, snapChat);
							if (user != null) {
								System.out.println("data updated successfully");
								System.out.println("password updated is" + user.getSnapchatpassword());
							}
						}

					}
					case 4:{
						
							 {
								 System.out.println("enter fbPassword");
								 String XPassword=scanner.next();
								 
								 User user=dao.updateX(email,XPassword);
								 if(user!=null) {
									 System.out.println("data updated successfully");
									 System.out.println("password updated is"+user.getXpassword());
								 }
							 }
						 
					}

					}
				}

				}
			}
		}

		default:
			break;

		}

	}

}
