/**
 * Nama : Ratu Sekar Ayu Nisa
 * Nim: 24060123140130
 * Tanggal Pembuat: 14/05/2025
 * File: DAOManager.java
 * Deskripsi: pengelola DAO dalam program
 */
public class DAOManager{
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO person){
        personDAO = person;
    }
    public PersonDAO getPersonDAO(){
        return personDAO;
    }
}