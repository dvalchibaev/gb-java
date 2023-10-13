// package gb_apps;
// /**
//  * app
//  */
// public class app {

//     public static void main(String[] args) {
//       Document doc = new Document();
//       doc.save(new JsonSave());
//       doc.save(new XmlSave());
//       doc.save(new DocxSave());
  
//       new Messager(new LocalStorage());
//     }
//   }
  
//   interface Saver {
//     void save(String data);
//   }
  
//   class JsonSave implements Saver {
  
//     @Override
//     public void save(String data) {
  
//     }
  
//   }
  
//   class NewJsonSave implements Saver {
  
//     @Override
//     public void save(String data) {
  
//     }
  
//   }
  
//   class XmlSave implements Saver {
  
//     @Override
//     public void save(String data) {
  
//     }
  
//   }
  
//   class DocxSave implements Saver {
  
//     @Override
//     public void save(String data) {
  
//     }
  
//   }
  
//   class Document {
//     String data;
  
//     void save(Saver logic) {
//       logic.save(data);
//     }
//   }
  
//   interface CRUD {
//     void create();
  
//     void read();
  
//     void delete();
  
//     void update();
//   }
  
//   class Db implements CRUD {
  
//     void connection() {
//     }
  
//     @Override
//     public void create() {
//       // TODO Auto-generated method stub
  
//     }
  
//     @Override
//     public void read() {
//       // TODO Auto-generated method stub
  
//     }
  
//     @Override
//     public void delete() {
//       // TODO Auto-generated method stub
  
//     }
  
//     @Override
//     public void update() {
//       // TODO Auto-generated method stub
  
//     }
  
//   }
  
//   class LocalStorage implements CRUD {
  
//     @Override
//     public void create() {
//       // TODO Auto-generated method stub
  
//     }
  
//     @Override
//     public void read() {
//       // TODO Auto-generated method stub
  
//     }
  
//     @Override
//     public void delete() {
//       // TODO Auto-generated method stub
  
//     }
  
//     @Override
//     public void update() {
//       // TODO Auto-generated method stub
  
//     }
  
//   }
  
//   class Messager {
//     CRUD crud;
  
//     public Messager(CRUD crud) {
//       this.crud = crud;
//     }
  
//   }