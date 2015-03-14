package com.example.myapplication2.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class InfoActivity extends Activity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.expandableListView);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);
    }

    /*
     * Preparing the list data
     */
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Drug Details");
        listDataHeader.add("Side Effects");
        listDataHeader.add("Precaution");
        listDataHeader.add("Drug Interaction");
        listDataHeader.add("Pregnancy/Breastfeeding");

        // Adding child data
        List<String> drugDetails = new ArrayList<String>();
        drugDetails.add("Vicodin contains a combination of acetaminophen and hydrocodone. Both medicines are pain killers. Hydrocodone is an opioid pain medication. An opioid is sometimes called a narcotic. Acetaminophen is a less potent pain reliever that increases the effects of hydrocodone.\n" +
                "\n" +
                "Vicodin is used to relieve moderate to severe pain.\n" +
                "\n" +
                "Vicodin may also be used for purposes not listed in this medication guide.");

        List<String> sideEffects = new ArrayList<String>();
        sideEffects.add("More common\n" +
                "Dizziness\n" +
                "lightheadedness\n" +
                "Incidence not known\n" +
                "Back, leg, or stomach pains\n" +
                "black, tarry stools\n" +
                "bleeding gums\n" +
                "blood in the urine or stools\n" +
                "blood in vomit\n" +
                "bluish lips or skin\n" +
                "chills\n" +
                "choking\n" +
                "cough or hoarseness\n" +
                "dark urine\n" +
                "decrease in the frequency of urination\n" +
                "decrease in urine volume\n" +
                "difficult or troubled breathing\n" +
                "difficulty in passing urine (dribbling)\n" +
                "difficulty with breathing\n" +
                "difficulty with swallowing\n" +
                "fast heartbeat\n" +
                "fever\n" +
                "fever with or without chills\n" +
                "general body swelling\n" +
                "general feeling of tiredness or weakness\n" +
                "headache\n" +
                "irregular, fast or slow, or shallow breathing\n" +
                "light-colored stools\n" +
                "loss of appetite\n" +
                "lower back or side pain\n" +
                "nausea or vomiting\n" +
                "nosebleeds\n" +
                "not breathing\n" +
                "painful or difficult urination\n" +
                "pale or blue lips, fingernails, or skin\n" +
                "pinpoint red spots on the skin\n" +
                "puffiness or swelling of the eyelids or around the eyes, face, lips, or tongue\n" +
                "severe or continuing stomach pain\n" +
                "shortness of breath or troubled breathing\n" +
                "skin rash, hives, or itching\n" +
                "sore throat\n" +
                "sore tongue\n" +
                "sores, ulcers, or white spots on the lips or in the mouth\n" +
                "tightness in the chest\n" +
                "unable to speak\n" +
                "unusual bleeding or bruising\n" +
                "unusual tiredness or weakness\n" +
                "upper right abdominal or stomach pain\n" +
                "yellow eyes and skin");

        List<String> precautions = new ArrayList<String>();
        precautions.add("You should not use Vicodin if you are allergic to acetaminophen (Tylenol) or hydrocodone, or if you have recently used alcohol, sedatives, tranquilizers, or other narcotic medications.\n" +
                "\n" +
                "Do not use Vicodin if you have taken an MAO inhibitor in the past 14 days. A dangerous drug interaction could occur. MAO inhibitors include isocarboxazid, linezolid, phenelzine, rasagiline, selegiline, and tranylcypromine.");

        List<String> interactions = new ArrayList<String>();
        interactions.add("Ambien (zolpidem) \n" +
                "aspirin \n" +
                "Cymbalta (duloxetine) \n" +
                "Flexeril (cyclobenzaprine) \n" +
                "gabapentin \n" +
                "ibuprofen \n" +
                "levothyroxine \n" +
                "lisinopril \n" +
                "Lyrica (pregabalin) \n" +
                "metformin \n" +
                "metoprolol \n" +
                "Neurontin (gabapentin) \n" +
                "omeprazole \n" +
                "prednisone \n" +
                "simvastatin \n" +
                "Synthroid (levothyroxine) \n" +
                "tramadol \n" +
                "trazodone \n" +
                "Vitamin D3 (cholecalciferol) \n" +
                "Xanax (alprazolam)");

        List<String> preganacy = new ArrayList<String>();
        preganacy.add("FDA pregnancy category: C Acetaminophen-hydrocodone should only be given during pregnancy when benefit outweighs risk.\n" +
                "\n" +
                "Babies born to mothers who have been taking opioids regularly prior to delivery will be physically dependent. Withdrawal signs include irritability and excessive crying, tremors, hyperactive reflexes, increased respiratory rate, increased stools, sneezing, yawning, vomiting, and fever. FDA pregnancy category C: Animal reproduction studies have shown an adverse effect on the fetus and there are no adequate and well-controlled studies in humans, but potential benefits may warrant use of the drug in pregnant women despite potential risks.\n" +
                "\n" +
                "Acetaminophen / hydrocodone Breastfeeding Warnings\n" +
                "\n" +
                "A decision should be made to discontinue breast-feeding or discontinue the drug, taking into account the importance of the drug to the mother. Excreted into human milk: Yes (acetaminophen and hydrocodone) Excreted into animal milk: Yes (acetaminophen and hydrocodone) There have been reports of rash, drowsiness, limpness, and lethargy in breastfed infants of mothers taking acetaminophen-hydrocodone.");

        listDataChild.put(listDataHeader.get(0), drugDetails); // Header, Child data
        listDataChild.put(listDataHeader.get(1), sideEffects);
        listDataChild.put(listDataHeader.get(2), precautions);
        listDataChild.put(listDataHeader.get(3), interactions);
        listDataChild.put(listDataHeader.get(4), preganacy);
    }
}
