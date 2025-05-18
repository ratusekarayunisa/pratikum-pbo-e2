/**
 * Nama : Ratu Sekar Ayu Nisa
 * Nim: 24060123140130
 * Tanggal Pembuat: 14/05/2025
 * File: MainDAO.java
 * Deskripsi: Main program untuk akses DAO
 */

public class MainDAO {
    public static void main(String[] args) {
        Person person = new Person("Indra");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());
        try{
            m.getPersonDAO().savePerson(person);
        }catch (Exception e ){
            e.printStackTrace();
        }
    } 
}
