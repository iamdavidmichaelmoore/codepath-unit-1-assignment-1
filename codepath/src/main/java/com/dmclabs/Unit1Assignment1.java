package com.dmclabs;

import com.dmclabs.hash.FindKMostFrequentWords;
import com.dmclabs.stacks.FindMaximumStack;
import com.dmclabs.stacks.PostfixToInfix;

/**
 * Hello world!
 *
 */
public class Unit1Assignment1 
{
    public static void main( String[] args )
    {
        //SECTION - Execute Stacks
        // Unit1Assignment1.findMaxStack();
        Unit1Assignment1.postfixToInfix();
        
        //SECTION - Execute Queues
        
        
        //SECTION - Execute Hash Tables
        // Unit1Assignment1.findKMostFrequentWords();
    }

    //SECTION - Stacks Functions
    //ANCHOR - Find Maximum Stack
    public static void findMaxStack() {
        FindMaximumStack stack = new FindMaximumStack();
        stack.push(2);
        stack.findMax();
        stack.push(6);
        stack.findMax();
        stack.pop();
        stack.findMax();
    }

    public static void postfixToInfix() {
        PostfixToInfix pToI = new PostfixToInfix();
        String expression = "ab*c+";
        String infix = pToI.getInfixExpression(expression);
        System.out.println(infix);
    }

    //SECTION - Queues Functions

    //SECTION - Hash Tables
    //ANCHOR - Find K Most Frequent Words From an Array
    public static void findKMostFrequentWords() {
        String someWords = "But now hear, O Jacob my servant,And Israel whom I have chosen!Thus says the Lord who made you,Who formed you from the womb and will help you:Do not fear, O Jacob my servant,Jeshurun whom I have chosen.For I will pour water on the thirsty land,And streams on the dry ground;I will pour my Spirit on your offspring,And my blessing on your descendants.They will spring up like grass in a meadow,Like poplar trees by flowing streams.One will say, I am the Lords,Another will call himself by the name of Jacob,Still another will write on his hand, The Lords,Thus says the Lord, the King of Israel,And his Redeemer, the Lord of hosts:I am the first and I am the last;Besides me there is no God.Who is like me? Let him proclaim it,Let him declare and set it before me,Since I appointed an ancient people.And what is the one who declares the things to come,So that they may come to pass?Do not fear, nor be afraid;Have I not proclaimed to you from of old and declared it?You are my witnesses.Is there a God besides me?There is no other Rock; I know not one.All who make idols are nothing,And their precious things are worthless.They will all be destroyed together.But Israel is saved by the LordWith an everlasting salvation;You shall not be put to shame or humiliatedTo all eternity.For thus says the Lord, who created the heavens,He is God, who formed the earth and made it,Who established it and did not create it empty,But formed it to be inhabited:I am the Lord, and there is no other.I did not speak in secret,In a dark place of the earth;I did not say to the offspring of Jacob,Seek me in vain.I, the Lord, speak the truth;I declare what is right.Assemble yourselves and come,Draw near together,You fugitives from the nations. Ignorant are those who carry about their wooden idols,And pray to a god that cannot save.Declare and present your case;Let them take counsel together!Who has announced this from of old?Who has declared it from long ago?Was it not I, the Lord?And there is no other God besides me,A righteous God and a Savior;There is none besides me.Turn to me and be saved,All the ends of the earth;For I am God, and there is no other.By myself I have sworn,From my mouth has gone forth in righteousnessA word that will not return:Every knee shall bow to me,Every tongue shall swear allegiance.Surely they shall say of me,In the Lord alone are righteousnessAnd strength.All who rage against himWill come to him and be put to shame.In the Lord all descendants of IsraelWill be justified and will exult.";
        String[] wordsArray = someWords.split(" ");
        FindKMostFrequentWords words  = new FindKMostFrequentWords(wordsArray);
        words.countWords();
    }
}
