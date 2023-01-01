package com.yusuf.betterguess;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random random=new Random();
    String clue2="^^",clue3="^^^",clue4="^^^^",clue5="^^^^^",clue6="^^^^^^",clue7="^^^^^^^",clue8="^^^^^^^^",clue9="^^^^^^^^^",clue10="^^^^^^^^^^";
    char[] clue;
    int clueCounter=0;
    int points;
    int randomWordIndex;
    int randomInsideArray;
    ArrayList<Integer>randomIndicies=new ArrayList<Integer>();
    String wordClue;
    TextView pointsText;
    TextView errorIndicator;
    TextView remainingAttemptsText;       /*   TEXT   INITIALIZING*/
    TextView remainingCluesText;            /*   TEXT   INITIALIZING*/
    TextView clueText;                  /*   TEXT   INITIALIZING*/
    EditText wordInputText;             /*   TEXT   INITIALIZING*/
    int remainingAttempts;
    int remainingClues;
    int randomWordChooser;
    String[]words={"while","loop","car","keyboard","teacher","school","apple","phone","mobile","developer","movie","window","computer","bus","try","chase","president","array","arrow","author","fitness","bed","bad","building","app","book","store","value","elephant","warning","friend","mouse","touch","drink","running","help","mind","guess","good","view","version","light","sunny","snow","tire","night","time","charge","cold","dictionary","back","profile","screen","problem","ability","able","without","accept","above","according","account","across","actual","add","admit","word","affect","after","contain","control","cost","could","country","couple","course","debate","decide","deep"};
    String word;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);           /* STARTING*/
        setContentView(R.layout.activity_main);
        pointsText=findViewById(R.id.pointsText);
        errorIndicator=findViewById(R.id.errorIndicator);
        remainingAttemptsText=findViewById(R.id.remainingAttemptsText);
        remainingCluesText=findViewById(R.id.remainingCluesText);
        clueText=findViewById(R.id.clueText);
        wordInputText=findViewById(R.id.wordInputText);
        remainingAttempts=5;
        randomWordChooser=random.nextInt(words.length);
        word=words[randomWordChooser];
        points=0;
        pointsText.setText("POINTS : "+points);
        for(int i=0;i<word.length();i++){
            randomIndicies.add(i);
        }
        remainingAttemptsText.setText("REMAINING ATTEMPTS : "+remainingAttempts);
        switch(word.length()){
            case 2:
                clue=clue2.toCharArray();
                break;
            case 3:
                clue=clue3.toCharArray();
                break;
            case 4:
                clue=clue4.toCharArray();
                break;
            case 5:
                clue=clue5.toCharArray();
                break;
            case 6:
                clue=clue6.toCharArray();
                break;
            case 7:
                clue=clue7.toCharArray();
                break;
            case 8:
                clue=clue8.toCharArray();
                break;
            case 9:
                clue=clue9.toCharArray();
                break;
            case 10:
                clue=clue10.toCharArray();
                break;
        }
        wordClue=String.valueOf(clue);
        remainingClues=5;
        remainingCluesText.setText("REMAINING CLUES : "+remainingClues);

    }
    public void guessButton(View view){
       if(remainingAttempts>0){
           if(wordInputText.getText().toString().equalsIgnoreCase(word)==true){
               errorIndicator.setText("YOU WON, THE WORD WAS : "+word+". NEW GAME STARTED! CLUE INCREASED!");
               points+=100;
               pointsText.setText("POINTS : "+points);
               /* NEW GAME START*/
               clueCounter=0;
               randomIndicies.clear();
               String clue2="^^",clue3="^^^",clue4="^^^^",clue5="^^^^^",clue6="^^^^^^",clue7="^^^^^^^",clue8="^^^^^^^^",clue9="^^^^^^^^^",clue10="^^^^^^^^^^";
               remainingAttempts=5;
               randomWordChooser=random.nextInt(words.length);
               word=words[randomWordChooser];
               for(int i=0;i<word.length();i++){
                   randomIndicies.add(i);
               }
               switch(word.length()){
                   case 2:
                       clue=clue2.toCharArray();
                       break;
                   case 3:
                       clue=clue3.toCharArray();
                       break;
                   case 4:
                       clue=clue4.toCharArray();
                       break;
                   case 5:
                       clue=clue5.toCharArray();
                       break;
                   case 6:
                       clue=clue6.toCharArray();
                       break;
                   case 7:
                       clue=clue7.toCharArray();
                       break;
                   case 8:
                       clue=clue8.toCharArray();
                       break;
                   case 9:
                       clue=clue9.toCharArray();
                       break;
                   case 10:
                       clue=clue10.toCharArray();
                       break;
               }
               wordClue=String.valueOf(clue);
               remainingClues+=4;
               remainingAttemptsText.setText("REMAINING ATTEMPTS : "+remainingAttempts);
               remainingCluesText.setText("REMAINING CLUES : "+remainingClues);
               clueText.setText("CLUE!");
           }
           else{
               points-=30;
               pointsText.setText("POINTS : "+points);
               errorIndicator.setText("SORRY, WRONG ANSWER. -30 POINTS!");
               remainingAttempts--;
               remainingAttemptsText.setText("REMAINING ATTEMPTS: "+remainingAttempts);
           }
       }
       else{
           errorIndicator.setText("NO MORE ATTEMPTS. THE WORD WAS : "+word+". NEW GAME STARTED,-70 POINTS!");
           /* NEW GAME START*/
           clueCounter=0;
           points-=70;
           pointsText.setText("POINTS : "+points);
           randomIndicies.clear();
           String clue2="^^",clue3="^^^",clue4="^^^^",clue5="^^^^^",clue6="^^^^^^",clue7="^^^^^^^",clue8="^^^^^^^^",clue9="^^^^^^^^^",clue10="^^^^^^^^^^";
           remainingAttempts=5;
           remainingClues=word.length()-2;
           randomWordChooser=random.nextInt(words.length);
           word=words[randomWordChooser];
           for(int i=0;i<word.length();i++){
               randomIndicies.add(i);
           }
           switch(word.length()){
               case 2:
                   clue=clue2.toCharArray();
                   break;
               case 3:
                   clue=clue3.toCharArray();
                   break;
               case 4:
                   clue=clue4.toCharArray();
                   break;
               case 5:
                   clue=clue5.toCharArray();
                   break;
               case 6:
                   clue=clue6.toCharArray();
                   break;
               case 7:
                   clue=clue7.toCharArray();
                   break;
               case 8:
                   clue=clue8.toCharArray();
                   break;
               case 9:
                   clue=clue9.toCharArray();
                   break;
               case 10:
                   clue=clue10.toCharArray();
                   break;
           }
           wordClue=String.valueOf(clue);
           remainingClues++;
           remainingAttemptsText.setText("REMAINING ATTEMPTS : "+remainingAttempts);
           remainingCluesText.setText("REMAINING CLUES : "+remainingClues);
           clueText.setText("CLUE!");
       }

    }
    public void clueButton(View view){
        clueCounter++;
        if(remainingClues>0&&clueCounter<word.length()+1){
            randomWordIndex=random.nextInt(randomIndicies.size());
            randomInsideArray=randomIndicies.get(randomWordIndex);
            clue[randomInsideArray]=word.charAt(randomInsideArray);
            randomIndicies.remove(randomWordIndex);
            wordClue=String.valueOf(clue);
            clueText.setText(wordClue);
            remainingClues--;
            remainingCluesText.setText("REMAINING CLUES : "+remainingClues);
        }
        else{
            remainingCluesText.setText("NO MORE CLUES");
        }
    }
}