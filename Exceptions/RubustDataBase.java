package Exceptions;

public class RubustDataBase implements DataBase {
  private DataBase firstDB;
  private DataBase secondDB;

  public void save(String info) throws DataBaseException{

    try {
      firstDB.save(info);
      }catch (DataBaseException exA){
        //Strategy: catch and process
          try{
              secondDB.save(info);
          } catch (DataBaseException exB){
            //Strategy: catch and rethrow old
            exA.addSuppressed(exB);
            throw exA;
          }
      }


  }
}
