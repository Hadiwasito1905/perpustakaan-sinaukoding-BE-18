package sinaukodingBE18.perpustakaan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.context.SecurityContextHolder;
import sinaukodingBE18.perpustakaan.entity.User;

@SpringBootApplication
public class PerpustakaanApplication {

	public static void main(String[] args) {
		SpringApplication.run(PerpustakaanApplication.class, args);
	}

	public static User getCurrentUser(){
		try{
			Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			return (User) principal;

			}catch (Exception ignore){
					}
		return null;
	}

}
