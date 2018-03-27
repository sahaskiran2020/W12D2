package excelprjTestbed;


import java.io.*;



import org.apache.poi.ss.usermodel.*;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;





public class datacopy {


		

		 

		        public static void main(String[] args) throws Exception{

		                 

		                FileInputStream file= new FileInputStream(new File("C:\\Users\\Saahas\\Desktop\\Anil_SD Faculty Effort Log v2.xlsx"));

		                  

		                XSSFWorkbook inputWorkbook=new XSSFWorkbook(file);

		                  

		                XSSFSheet worksheet = inputWorkbook.getSheetAt(0); 

		                  

		                Cell cell = null; // declare a Cell object

		                

		                cell = worksheet.getRow(21).getCell(3);   // Access the second cell in second row to update the value

		                  

		                cell.setCellValue("effortlog");  // Get current cell value value and change the value

		                  

		                file.close(); //Close the InputStream

		                 

		                FileOutputStream output_file =new FileOutputStream(new File("C:\\Users\\Saahas\\Desktop\\Week10\\Copying.xlsx"));  //Open FileOutputStream to write updates

		                  

		                inputWorkbook.write(output_file); //write changes

		                inputWorkbook.close();

		                output_file.close();  //close the stream    

		        }

		}



