// ============================================================================
//
// Copyright (C) 2006-2007 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//   
// ============================================================================
package routines.system;

public class FormatterUtils {

    public static String format_Date(java.util.Date date, String pattern) {
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(pattern);
        return simpleDateFormat.format(date);
    }

    /**
     * in order to transform the number "1234567.89" to string 123,456.89
     */
    public static String format_Number(String s, char thousandsSeparator, char decimalSeparator) {
        if (s == null) {
            return null;
        }
        String temp = formatNumber(s, thousandsSeparator);
        String result = temp.replace('.', decimalSeparator);
        return result;
    }

    private static String formatNumber(String s, char thousandsSeparator) {

        StringBuilder sb = new StringBuilder(s);
        int index = sb.indexOf(".");
        if (index == -1) {
            index = sb.length();
        }

        index = index - 3;
        while (index > 0 && sb.charAt(index - 1) != '-') {
            sb.insert(index, thousandsSeparator);
            index = index - 3;
        }

        return sb.toString();
    }
}
