import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Locale;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Main {

    public static void main(String[] args){
        String arr[][] = new String[10000][5];
        int count;
        int i =0; int j =0;
        try
        {
            File file = new File("Path of Excel file you have to read");
            FileInputStream fis = new FileInputStream(file);

            XSSFWorkbook wb = new XSSFWorkbook(fis);
            XSSFSheet sheet = wb.getSheetAt(0);
            Iterator<Row> itr = sheet.iterator();    //iterating over excel file

            while (itr.hasNext())
            {
                Row row = itr.next();
                Iterator<Cell> cellIterator = row.cellIterator();   //iterating over each column
                while (cellIterator.hasNext())
                {
                    Cell cell = cellIterator.next();
                    switch (cell.getCellType())
                    {
                        case Cell.CELL_TYPE_STRING:    //field that represents string cell type
                            arr[i][j] = cell.getStringCellValue();
                            if(j%4 == 0 && j!=0){
                                j=0;
                                i++;
                            }
                            else
                                j++;

                            break;
                        case Cell.CELL_TYPE_NUMERIC:    //field that represents number cell type
                            DataFormatter formatter = new DataFormatter(Locale.US);
                            arr[i][j] = (String.valueOf(formatter.formatCellValue(cell)));
                            if(j%4 == 0 && j!=0){
                                j=0;
                                i++;
                            }
                            else
                                j++;

                            break;

                        default:

                    }

                }


            }


        }
        catch(Exception e)
        {
            e.printStackTrace();
        }


        count = i;


        System.out.print("-------------------------------------------------------------------------");
        System.out.println();

        for(i =0;i<count;i++){
            for(j=0;j<5;j++) {
                System.out.print(arr[i][j] + "\t\t\t");
            }
            System.out.println();
        }
        System.out.print("-----------------------------------------------------------------------------");


    }
}
