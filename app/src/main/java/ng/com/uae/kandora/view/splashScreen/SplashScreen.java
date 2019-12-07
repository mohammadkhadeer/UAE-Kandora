package ng.com.uae.kandora.view.splashScreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

import ng.com.uae.kandora.R;
import ng.com.uae.kandora.model.BackFace;
import ng.com.uae.kandora.model.ClothType;
import ng.com.uae.kandora.model.CollarType;
import ng.com.uae.kandora.model.CuffType;
import ng.com.uae.kandora.model.Description;
import ng.com.uae.kandora.model.FrontFace;
import ng.com.uae.kandora.model.FrontPockets;
import ng.com.uae.kandora.model.FrontPocketsComp;
import ng.com.uae.kandora.model.ImagePath;
import ng.com.uae.kandora.model.ItemDetails;
import ng.com.uae.kandora.model.ItemComponents;
import ng.com.uae.kandora.model.KandoraType;
import ng.com.uae.kandora.model.Name;
import ng.com.uae.kandora.model.Offer;
import ng.com.uae.kandora.model.PeopleComment;
import ng.com.uae.kandora.model.PeopleCommentsDetails;
import ng.com.uae.kandora.model.Rate;
import ng.com.uae.kandora.model.SpecialOfferDes;
import ng.com.uae.kandora.model.Stitching;

public class SplashScreen extends AppCompatActivity {

    FirebaseDatabase database;
    DatabaseReference myRef;
    public ArrayList<FrontPocketsComp> frontPocketsComp ;
    public ArrayList<PeopleCommentsDetails> peopleCommentsDetails ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("newItems").child("item1");

        //writeOnfireBaseDatabase();
        redFromDataBase();
        createItemObjectAndUpload();

    }

    private void createItemObjectAndUpload() {
        frontPocketsComp = new ArrayList<FrontPocketsComp>();
        peopleCommentsDetails = new ArrayList<PeopleCommentsDetails>();

        Description description = new Description("تجربة باللغة العربية","english test");
        ImagePath imagePath = new ImagePath("gs://uae-kandora.appspot.com/UAE-kandora/1.png");


        BackFace backFace = new BackFace("تجربة باللغة العربية","english test");
        ClothType clothType = new ClothType("تجربة باللغة العربية","english test");
        CollarType collarType = new CollarType("تجربة باللغة العربية","english test");
        CuffType cuffType = new CuffType("تجربة باللغة العربية","english test");
        FrontFace frontFace = new FrontFace("تجربة باللغة العربية","english test");

        FrontPocketsComp frontPocketsComp1 = new FrontPocketsComp("تجربة باللغة العربية 1","english test");
        FrontPocketsComp frontPocketsComp2 = new FrontPocketsComp("تجربة باللغة العربية 2","english 2 test");
        frontPocketsComp.add(frontPocketsComp1);
        frontPocketsComp.add(frontPocketsComp2);
        FrontPockets frontPockets = new FrontPockets(frontPocketsComp);

        KandoraType kandoraType = new KandoraType("تجربة باللغة العربية","english test");
        Stitching stitching = new Stitching("تجربة باللغة العربية","english test");

        ItemComponents itemComponents = new ItemComponents(backFace,clothType,collarType,cuffType,frontFace,frontPockets,kandoraType,stitching);


        Name name = new Name("تجربة باللغة العربية","english test");
        SpecialOfferDes specialOfferDes = new SpecialOfferDes("تجربة باللغة العربية","english test");
        Offer offer = new Offer("0.20","32487498374","1","0",specialOfferDes);

        PeopleCommentsDetails peopleCommentsDetailsObiect = new PeopleCommentsDetails("ahmed","good","gs://uae-kandora.appspot.com/USA-kandora/4.png");
        peopleCommentsDetails.add(peopleCommentsDetailsObiect);
        PeopleComment peopleComment = new PeopleComment(peopleCommentsDetails);
        Rate rate = new Rate("70","243");


        ItemDetails itemDetails = new ItemDetails("0.05","uae","1",description,imagePath,itemComponents,"1001",name,offer,peopleComment,230,rate);

        Log.i("TAG",itemDetails.toString());

        myRef.setValue(itemDetails);

    }

    private void redFromDataBase() {
        myRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                ItemDetails user = dataSnapshot.getValue(ItemDetails.class);
                Log.i("yarab",user.toString());
                Log.i("yarab2",user.getItemID());
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {}

        });
    }

    private void writeOnfireBaseDatabase() {
        //myRef.setValue("Hello, GGG!");
    }
}
