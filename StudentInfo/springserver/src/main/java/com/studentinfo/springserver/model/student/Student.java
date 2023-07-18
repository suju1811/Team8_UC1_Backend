package com.studentinfo.springserver.model.student;

import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int stud_Id;
    private int udid;
    private int emis_identifier;
    private String Student_First_Name;
   // private String Student_Middle_Name;
    private String Student_Last_Name;
    private String Student_Email_Address_Text;
    private Long Student_Contact_Number;
    private String Student_Birth_Month_Number;
    private Integer Student_Birth_Day_Number;
    private Integer Student_Birth_Year;
    private String Student_Gender;

    private Integer Admission_Month_Number;
    private Integer Admission_Day_Number;
    private Integer Admission_Year;
    private String Admitted_Grade;

    private Boolean Disability_Indicator;
    private String Father_Name;
    private String Father_Occupation_Text;
    private Long Father_Annual_Income_Amount;
    private String Mother_Name;
    private String Mother_Occupation_Text;
   // private Long Mother_Annual_Income_Amount;


    private Long Student_Aadhar_Identifier;
    private String Current_Address_Line1_Text;
    private String Current_Address_Line2_Text;
    private String Current_Address_Line3_Text;
    private String Current_Address_City_Name;
    private String Current_Address_State_Name;
    private Long Current_Address_Zip_Code;
    private String Permanent_Address_Line1_Text;
    private String Permanent_Address_Line2_Text;
    private String Permanent_Address_Line3_Text;
    private String Permanent_Address_City_Name;
    private String Permanent_Address_State_Name;
    private Long Permanent_Address_Zip_Code;
    private String Primary_Contact_Name;
    private Long Primary_Contact_Number;
    private String Primary_Contact_Relationship_Text;

   private String Secondary_Contact_Name;
   private Long Secondary_Contact_Number;
   private String Secondary_Contact_Relationship_Text;

 public int getStud_Id() {
  return stud_Id;
 }

 public void setStud_Id(int stud_Id) {
  this.stud_Id = stud_Id;
 }

 public int getUdid() {
  return udid;
 }

 public void setUdid(int udid) {
  this.udid = udid;
 }

 public int getEmis_identifier() {
  return emis_identifier;
 }

 public void setEmis_identifier(int emis_identifier) {
  this.emis_identifier = emis_identifier;
 }

 public String getStudent_First_Name() {
  return Student_First_Name;
 }

 public void setStudent_First_Name(String student_First_Name) {
  Student_First_Name = student_First_Name;
 }

 public String getStudent_Last_Name() {
  return Student_Last_Name;
 }

 public void setStudent_Last_Name(String student_Last_Name) {
  Student_Last_Name = student_Last_Name;
 }

 public String getStudent_Email_Address_Text() {
  return Student_Email_Address_Text;
 }

 public void setStudent_Email_Address_Text(String student_Email_Address_Text) {
  Student_Email_Address_Text = student_Email_Address_Text;
 }

 public Long getStudent_Contact_Number() {
  return Student_Contact_Number;
 }

 public void setStudent_Contact_Number(Long student_Contact_Number) {
  Student_Contact_Number = student_Contact_Number;
 }

 public String getStudent_Birth_Month_Number() {
  return Student_Birth_Month_Number;
 }

 public void setStudent_Birth_Month_Number(String student_Birth_Month_Number) {
  Student_Birth_Month_Number = student_Birth_Month_Number;
 }

 public Integer getStudent_Birth_Day_Number() {
  return Student_Birth_Day_Number;
 }

 public void setStudent_Birth_Day_Number(Integer student_Birth_Day_Number) {
  Student_Birth_Day_Number = student_Birth_Day_Number;
 }

 public Integer getStudent_Birth_Year() {
  return Student_Birth_Year;
 }

 public void setStudent_Birth_Year(Integer student_Birth_Year) {
  Student_Birth_Year = student_Birth_Year;
 }

 public String getStudent_Gender() {
  return Student_Gender;
 }

 public void setStudent_Gender(String student_Gender) {
  Student_Gender = student_Gender;
 }

 public Integer getAdmission_Month_Number() {
  return Admission_Month_Number;
 }

 public void setAdmission_Month_Number(Integer admission_Month_Number) {
  Admission_Month_Number = admission_Month_Number;
 }

 public Integer getAdmission_Day_Number() {
  return Admission_Day_Number;
 }

 public void setAdmission_Day_Number(Integer admission_Day_Number) {
  Admission_Day_Number = admission_Day_Number;
 }

 public Integer getAdmission_Year() {
  return Admission_Year;
 }

 public void setAdmission_Year(Integer admission_Year) {
  Admission_Year = admission_Year;
 }

 public String getAdmitted_Grade() {
  return Admitted_Grade;
 }

 public void setAdmitted_Grade(String admitted_Grade) {
  Admitted_Grade = admitted_Grade;
 }

 public Boolean getDisability_Indicator() {
  return Disability_Indicator;
 }

 public void setDisability_Indicator(Boolean disability_Indicator) {
  Disability_Indicator = disability_Indicator;
 }

 public String getFather_Name() {
  return Father_Name;
 }

 public void setFather_Name(String father_Name) {
  Father_Name = father_Name;
 }

 public String getFather_Occupation_Text() {
  return Father_Occupation_Text;
 }

 public void setFather_Occupation_Text(String father_Occupation_Text) {
  Father_Occupation_Text = father_Occupation_Text;
 }

 public Long getFather_Annual_Income_Amount() {
  return Father_Annual_Income_Amount;
 }

 public void setFather_Annual_Income_Amount(Long father_Annual_Income_Amount) {
  Father_Annual_Income_Amount = father_Annual_Income_Amount;
 }

 public String getMother_Name() {
  return Mother_Name;
 }

 public void setMother_Name(String mother_Name) {
  Mother_Name = mother_Name;
 }

 public String getMother_Occupation_Text() {
  return Mother_Occupation_Text;
 }

 public void setMother_Occupation_Text(String mother_Occupation_Text) {
  Mother_Occupation_Text = mother_Occupation_Text;
 }

 public Long getStudent_Aadhar_Identifier() {
  return Student_Aadhar_Identifier;
 }

 public void setStudent_Aadhar_Identifier(Long student_Aadhar_Identifier) {
  Student_Aadhar_Identifier = student_Aadhar_Identifier;
 }

 public String getCurrent_Address_Line1_Text() {
  return Current_Address_Line1_Text;
 }

 public void setCurrent_Address_Line1_Text(String current_Address_Line1_Text) {
  Current_Address_Line1_Text = current_Address_Line1_Text;
 }

 public String getCurrent_Address_Line2_Text() {
  return Current_Address_Line2_Text;
 }

 public void setCurrent_Address_Line2_Text(String current_Address_Line2_Text) {
  Current_Address_Line2_Text = current_Address_Line2_Text;
 }

 public String getCurrent_Address_Line3_Text() {
  return Current_Address_Line3_Text;
 }

 public void setCurrent_Address_Line3_Text(String current_Address_Line3_Text) {
  Current_Address_Line3_Text = current_Address_Line3_Text;
 }

 public String getCurrent_Address_City_Name() {
  return Current_Address_City_Name;
 }

 public void setCurrent_Address_City_Name(String current_Address_City_Name) {
  Current_Address_City_Name = current_Address_City_Name;
 }

 public String getCurrent_Address_State_Name() {
  return Current_Address_State_Name;
 }

 public void setCurrent_Address_State_Name(String current_Address_State_Name) {
  Current_Address_State_Name = current_Address_State_Name;
 }

 public Long getCurrent_Address_Zip_Code() {
  return Current_Address_Zip_Code;
 }

 public void setCurrent_Address_Zip_Code(Long current_Address_Zip_Code) {
  Current_Address_Zip_Code = current_Address_Zip_Code;
 }

 public String getPermanent_Address_Line1_Text() {
  return Permanent_Address_Line1_Text;
 }

 public void setPermanent_Address_Line1_Text(String permanent_Address_Line1_Text) {
  Permanent_Address_Line1_Text = permanent_Address_Line1_Text;
 }

 public String getPermanent_Address_Line2_Text() {
  return Permanent_Address_Line2_Text;
 }

 public void setPermanent_Address_Line2_Text(String permanent_Address_Line2_Text) {
  Permanent_Address_Line2_Text = permanent_Address_Line2_Text;
 }

 public String getPermanent_Address_Line3_Text() {
  return Permanent_Address_Line3_Text;
 }

 public void setPermanent_Address_Line3_Text(String permanent_Address_Line3_Text) {
  Permanent_Address_Line3_Text = permanent_Address_Line3_Text;
 }

 public String getPermanent_Address_City_Name() {
  return Permanent_Address_City_Name;
 }

 public void setPermanent_Address_City_Name(String permanent_Address_City_Name) {
  Permanent_Address_City_Name = permanent_Address_City_Name;
 }

 public String getPermanent_Address_State_Name() {
  return Permanent_Address_State_Name;
 }

 public void setPermanent_Address_State_Name(String permanent_Address_State_Name) {
  Permanent_Address_State_Name = permanent_Address_State_Name;
 }

 public Long getPermanent_Address_Zip_Code() {
  return Permanent_Address_Zip_Code;
 }

 public void setPermanent_Address_Zip_Code(Long permanent_Address_Zip_Code) {
  Permanent_Address_Zip_Code = permanent_Address_Zip_Code;
 }

 public String getPrimary_Contact_Name() {
  return Primary_Contact_Name;
 }

 public void setPrimary_Contact_Name(String primary_Contact_Name) {
  Primary_Contact_Name = primary_Contact_Name;
 }

 public Long getPrimary_Contact_Number() {
  return Primary_Contact_Number;
 }

 public void setPrimary_Contact_Number(Long primary_Contact_Number) {
  Primary_Contact_Number = primary_Contact_Number;
 }

 public String getPrimary_Contact_Relationship_Text() {
  return Primary_Contact_Relationship_Text;
 }

 public void setPrimary_Contact_Relationship_Text(String primary_Contact_Relationship_Text) {
  Primary_Contact_Relationship_Text = primary_Contact_Relationship_Text;
 }

 public String getSecondary_Contact_Name() {
  return Secondary_Contact_Name;
 }

 public void setSecondary_Contact_Name(String secondary_Contact_Name) {
  Secondary_Contact_Name = secondary_Contact_Name;
 }

 public Long getSecondary_Contact_Number() {
  return Secondary_Contact_Number;
 }

 public void setSecondary_Contact_Number(Long secondary_Contact_Number) {
  Secondary_Contact_Number = secondary_Contact_Number;
 }

 public String getSecondary_Contact_Relationship_Text() {
  return Secondary_Contact_Relationship_Text;
 }

 public void setSecondary_Contact_Relationship_Text(String secondary_Contact_Relationship_Text) {
  Secondary_Contact_Relationship_Text = secondary_Contact_Relationship_Text;
 }


//   // private String Additional_Details_Text;
//    private Boolean Birth_Certificate_Available_Indicator;
//    private Boolean Aadhar_Id_Available_Indicator;
//    private Boolean Community_Certificate_Applicable_Indicator;
//    private Boolean Community_Certificate_Available_Indicator;
//    private Long Whatsapp_Number;
//
//
//    private String Physician_Name;
//    private Long Physician_Primary_Contact_Number;
//    private Long Physician_Secondary_Contact_Number;
//    private String Preferred_Emergency_Hospital_Name;
//    private String Current_Medication_Detail_Text;
//    private String Medical_Allergy_Detail_Text;
//    private String Food_Allergy_Detail_Text;
//    private String Chronic_Health_Issue_Detail_Text;
//
//
//    private String Previous_School_Name;
//    private String Previous_School_City_Name;
//    private String Previous_School_State_Name;
//    private String Previous_School_Admission_Date;
//    private String Previous_School_Last_Date;

}
