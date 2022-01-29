
package controller;


import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;



/**
 *
 * @author Tiago F. Santos
 */
public class Utilitario {

    public Date FormataDataExibe(String Data) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date d = new Date ((df.parse(Data)).getTime());
        
        return d;
    }

    public String converteData(Date dtData) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        String result = sdf.format(dtData);
        return result;
    }
}
