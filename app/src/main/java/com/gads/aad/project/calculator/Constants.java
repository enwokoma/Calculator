package com.gads.aad.project.calculator;

import com.gads.aad.project.calculator.Backend.CgpaSaved;
import com.gads.aad.project.calculator.Backend.DiscountSaved;
import com.gads.aad.project.calculator.Backend.MarkSaved;
import com.gads.aad.project.calculator.Backend.SgpaSaved;

import java.util.ArrayList;
import java.util.List;

public class Constants {

    ///Editing///
    public static String PACKAGE_NAME="com.gads.aad.project.calculator";

    public static String FAV_TEXT = "FavText";

    public static String PERCENT_TAG = "PercentTag";
    public static String FAV_IMAGE="FavImage";

    public static String APP_UNIQUE_ID_STRING="AppUniqueId";
    public static String APP_UNIQUE_ID_VALUE="";
    public static String CURRENCY="currency";
    public static String THEME="Theme";
    public static Boolean LIGHT_THEME=true;
    public static String CURRENCY_VALUE="$";

    public static String [] titlesPer={"Marks %", "Ratio to %","General %","Change in %","Discount %"};
    public static int [] imagesPer={R.drawable.ic_percent_icon,R.drawable.ic_percent_icon,R.drawable.ic_percent_icon,R.drawable.ic_percent_icon,R.drawable.ic_percent_icon};

    public static String [] titlesGpa={"CGPA", "SGPA","GPA to %"};
    public static int [] imagesGpa={R.drawable.ic_cgpa,R.drawable.ic_sgpa,R.drawable.ic_gpa};

    public static String [] titlesGen={"Tax", "Tip","MarkUp","Margin","Doubling Time","Inflation"};
    public static int [] imagesGen={R.drawable.ic_tax,R.drawable.ic_tip,R.drawable.ic_percent_icon,R.drawable.ic_percent_icon,R.drawable.ic_percent_icon,R.drawable.ic_percent_icon};

    public static String EMAIL_ADDRESS="feedback.arpa@gmail.com";
    public static String YOUTUBE_LINK="https://www.youtube.com/channel/UCsejxapLU_Ia1NFpwNXto1Q";
    public static String INSTAGRAM_LINK="https://www.instagram.com/_arpa_studio/";
    public static String LINKDIN_LINK="https://www.linkedin.com/in/aneesh-anchan/";
    public static String FACEBOOK_LINK="https://m.facebook.com/arpa1212/";
    public static String TWITTER_LINK="https://twitter.com/ArpaLtd/";

    public static String FIREBASE_LINK="https://api-4617962611760843834-658956.firebaseio.com/";

    public static List<MarkSaved> MARKS_SAVED_LIST=new ArrayList<MarkSaved>();
    public static List<DiscountSaved> DISCOUNT_SAVED_LIST=new ArrayList<DiscountSaved>();
    public static List<SgpaSaved> SGPA_SAVED_LIST=new ArrayList<SgpaSaved>();
    public static List<CgpaSaved> CGPA_SAVED_LIST=new ArrayList<CgpaSaved>();

    ///Save////
    //Marks//
    public static String SAVE="save";
    public static String DIVIDER="₹₹";
    public static String MARKS_NAME="Marks";
    public static String SUBJECT_ARRAY="subjectArray";
    public static String MARKS_OBTAINED_ARRAY="marksObtained";
    public static String TOTAL_MARKS_ARRAY="";

    public static String TOPIC="topic";

    //PURCHASE//
    public static String PRODUCT_ID="Add the Product Id ";
    public static String GOOGLE_PLAY_LICENSE="Add the google Play License";
    public static boolean PURCHASE_STATUS=false;

}
