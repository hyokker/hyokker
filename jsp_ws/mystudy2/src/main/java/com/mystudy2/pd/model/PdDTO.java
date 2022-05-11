package com.mystudy2.pd.model;

import java.sql.Timestamp;

public class PdDTO {
   //1. private �������
   private int no;
   private String pdName; //���콺
   private int price; //19000	
   private Timestamp regdate;

   //2. ������
   public PdDTO() {
      super();
   }

   public PdDTO(int no, String pdName, int price, Timestamp regdate) {
      super();
      this.no = no;
      this.pdName = pdName;
      this.price = price;
      this.regdate = regdate;
   }

   //3. getter/setter
   public int getNo() {
      return no;
   }

   public void setNo(int no) {
      this.no = no;
   }

   public String getPdName() {
      return pdName;
   }

   public void setPdName(String pdName) {
      this.pdName = pdName;
   }

   public int getPrice() {
      return price;
   }

   public void setPrice(int price) {
      this.price = price;
   }

   public Timestamp getRegdate() {
      return regdate;
   }

   public void setRegdate(Timestamp regdate) {
      this.regdate = regdate;
   }

   //4. toString()
   @Override
   public String toString() {
      return "PdDTO [no=" + no + ", pdName=" + pdName + ", price=" + price + ", regdate=" + regdate + "]";
   }

}
