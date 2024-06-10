package application;

import model.entities.Departments;
import model.entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Informe o id para busca: ");
    int id = sc.nextInt();
    
    SellerDao sellerDao = DaoFactory.createSellerDao();
    
    Seller seller = sellerDao.findById(id);
    
    System.out.println("Resultado: ");
    System.out.println(seller);
  }
}

