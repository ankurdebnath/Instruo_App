package in.instruo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Created by Focus on 29-Mar-15.
 */
public class CodeFragment extends Fragment {

    /*hardcoded desc. Get in json format from API instead.*/
    public static String desc [] = {
            "<h3>Introduction</h3>\n" +
                    "<p>\n" +
                    "An event which tests logical thinking and basic programming skills. The idea behind this event is to figure out the \"Black Box\". <br/>\n" +
                    "The event will test your basic logic skills along with pattern analysis and recognition as you play with the code, identify the patterns and decipher it.\n" +
                    "</p>\n" +
                    "\n" +
                    "<h3>Rules and Regulations</h3>\n" +
                    "1. The maximum size of the team is 3 members,members can be from different college.<br/>\n" +
                    "2. Use of Google and Internet is allowed but only through Onsite computers, use of personal laptop or mobile is strictly prohibited.<br/>\n" +
                    "3. The event is totally onsite event and will be conducted during Instruo'15 , so one must register in Instruo' 15 in order to participate.<br/>\n" +
                    "4. In case of any discrepancy,decision of CodeIIEST will be final.<br/>\n" +
                    "\n" +
                    "<h3>Event Structure</h3>\n" +
                    "<p>\n" +
                    "Event consists of Two rounds with break in-between.<br/>\n" +
                    "Each round will test your skill in different domain of coding.<br/>\n" +
                    "Each round will be of 1.5 hours.</p>\n" +
                    "\n" +
                    "<h3>Contact</h3>\n" +
                    "<p>\n" +
                    "Sourav Goswami: +918016275158 (email: gosour@gmail.com)<br/>\n" +
                    "Saikat Majumdar: +919051277266 (email: saikatmajumdar002@gmail.com)<br/>\n" +
                    "Saikat Dey: +919051850448 (email: deysaikat95@gmail.com)<br/>\n" +
                    "Anurag Roy: +917278389228 (email: anu15roy@gmail.com)\n" +
                    "</p>",
            "<h3>Introduction</h3>\n" +
                    "<p>It has been years since the setup of the Ramanujan Library but still it has not got the fame and crowd that it should get on the basis of the facilities that it provides. In a market survey, it was found that it is due the fact that people do not see its presence online in today&rsquo;s digital world.</p>\n" +
                    "<p>So it has decided to launch a website. But it should be of its standard and should be as interactive and prompt as their services are. Make a website for the library and show us that even a library may have a very interesting website.</p>\n" +
                    "<h3>Rules and Regulations</h3>\n" +
                    "<p>1) This is a team event,maximum consist of 2 members, members can be of different institute. <br /> 2) The website should be responsive otherwise the entry will be highly penalised.<br /> 3) Use of CSS tools and JavaScript tools are allowed. But the website should be light.<br /> 4) You can use any kind of font tools to make your site more attractive.<br /> 5) You can use any kind of open source framework to make your site responsive.<br /> 6) You need to register for the event using our registration form online.<br /> 7) Entries should be zipped and sent to&nbsp;<a href=\"mailto:webd.instruo@gmail.com\" target=\"_blank\">webd.instruo@gmail.com</a><br /> 8) The decision of the WebD committee will be final and binding.<br /> 9) Last day of sending the entry is: 5th April, 2015</p>\n" +
                    "<h3>Problem Statement</h3>\n" +
                    "<p>Problem Statement of the event can be found here:<br /> <a style=\"font: 0.9em; text-decoration: underline;\" href=\"https://drive.google.com/file/d/0Bz4_GJEFu5M7SU9fQnJSTGZVVjA/view\" target=\"_blank\">https://drive.google.com/file/d/0Bz4_GJEFu5M7SU9fQnJSTGZVVjA/view</a><br /><br /></p>\n" +
                    "<h3>Contact</h3>\n" +
                    "<p>Ankit Choudhary: +919126696951 (email: <a href=\"mailto:ankitchoudhary2008@gmail.com\" target=\"_blank\">ankitchoudhary2008@<wbr />gmail.com</a>) <br /> Soumik Dalal: +919932285480 (email: <a href=\"mailto:soumik.dalal14@gmail.com\" target=\"_blank\">soumik.dalal14@gmail.com</a>) <br /> Raghav Jajodia: +918972317424 (email: <a href=\"mailto:jajodia.raghav@gmail.com\" target=\"_blank\">jajodia.raghav@gmail.com</a>)</p>",
            "<h3>Introduction</h3>\n" +
                    "<p>&rdquo; C makes it easy to shoot yourself in the foot; C++ makes it harder, but when you do, it blows away your whole leg.&rdquo;</p>\n" +
                    "<p>&ndash; Bjarne Stroustrup</p>\n" +
                    "<p>Do u think you have mastered the art of competitive coding? Maybe you need to reconsider! Well here is an event that will challenge your coding skills and make you bite your nails!</p>\n" +
                    "<p>CodeIIEST and Instruo'15 presents a computer programming competition to show your passion of coding, compete with other coders and go for the glory.</p>\n" +
                    "<h3>Rules and regulations</h3>\n" +
                    "<p>1) A team must consist of at most 3 members, and all members should belong to the same institution.<br /> 2) Allowed programming languages are C , C++ and JAVA.<br />3)The contest will be held in 2 rounds:</p>\n" +
                    "<p>Preliminary(Online) round: This will be an online round from which top 30 teams will be selected for the Final round. There will be 4 questions. Teams only from India are allowed.</p>\n" +
                    "<p>Final (Onsite) Round: The qualified teams will be given a set of 5 problems which they have to solve within a time period of 3 hours.</p>\n" +
                    "<p>Timing for preliminary round:<br /><span class=\"aBn\" tabindex=\"0\" data-term=\"goog_1196111480\"><span class=\"aQJ\">Thursday, 2nd April, 2015</span></span><br /> <span class=\"aBn\" tabindex=\"0\" data-term=\"goog_1196111481\"><span class=\"aQJ\">10 pm &ndash; 12 am</span></span></p>\n" +
                    "<h3>Contact:</h3>\n" +
                    "<p>Diptanshu Ghosh: +919883472439 (email: <a href=\"mailto:diptanshu94@gmail.com\" target=\"_blank\">diptanshu94@gmail.com</a>) <br /> Debagnick Ghosh: +919477120661 (email: <a href=\"mailto:deganick@gmail.com\" target=\"_blank\">deganick@gmail.com</a>) <br /> Pratik Sarkar: +919051138611 (email: <a href=\"mailto:Email%3Aiampratiksarkar@gmail.com\" target=\"_blank\">iampratiksarkar@gmail.com</a>)</p>",
            "<h3>Introduction</h3>\n" +
                    "<p>\n" +
                    "Have you ever wondered, when as a kid, why your hands stopped mid-way from picking that extra chocolate when your mother called out your name in a stricter than normal tone? Do you know why a monkey peels a banana upside down and why humans usually peel it from the stem? How do we with age figure out ways to hold a hot cup of tea in ways to not get burnt? All of the above happens through conditioning of the mind as determined by success or rewards, and failures or punishments, on performing an action. After repeated occurrences, we tend to learn the best suited action. This is essentially the essence of Reinforcement Learning.\n" +
                    "As humans, we've progressed in civilization through our ability to learn. But exactly how well have we learnt how to learn? If you think that unlocking the mysteries of cognition drives you, Learner's Dilemma is here to gear you up for the quest!\n" +
                    "</p>\n" +
                    "\n" +
                    "<h3>Problem Setting</h3>\n" +
                    "<p>\n" +
                    "You are a player in pursuit of victory, glory. You have to become an expert in a game that you haven’t played before, by competing against others who hasn’t played the game before as well. Let’s see how well you can learn to play to reach the top of the table.\n" +
                    "</p>\n" +
                    "<p>\n" +
                    "We shall provide you a judge (code), who knows the rules that decide a game, and at any stage based on the rules will declare a winner, or a tie. You will have to use the judge’s prudence and simulate matches between two opponents, to figure out or try to learn the rules of the game to create an optimal strategy for victory. The idea here is to try out various combinations of moves as both player 1 and player 2, simulating a match between them, and observing the response/verdict of the judge to moves and patterns on the match board, to determine the rules of the game, or effectively what can be a winning sequence of moves. The detailed problem statement along with rules and regulations will be available here.\n" +
                    "</p>\n" +
                    "\n" +
                    "<h3>Teams</h3>\n" +
                    "<p>\n" +
                    "Maximum size of each team can be 3.\n" +
                    "</p>\n" +
                    "\n" +
                    "<h3>Duration</h3>\n" +
                    "<p>\n" +
                    "The event will be kick started on 3rd April 00:00 IST. Duration of the event will be for 10 days, making the deadline 12th April 24:00 IST.\n" +
                    "</p>\n" +
                    "\n" +
                    "<h3>Registration</h3>\n" +
                    "<p>\n" +
                    "Registration is open for the entire length of the event. To register, send a mail containing team name, name of member(s) and affiliation to <b>&lt;learnersdilemma@mail.instruo.in&gt;</b>.\n" +
                    "</p>\n" +
                    "<h3>Download the Problem Statement<h3/>\n" +
                    "<p>\n" +
                    "<a href=\"http://instruo.in/media/c9a5d32791374233bd29c254cb5bf4a7/manual.pdf\" target=\"_blank\" style=\"text-decoration: underline; font-weight: bold;\">Come get it </a> \n" +
                    "</p>\n" +
                    "<h3>Resources</h3>\n" +
                    "<p>\n" +
                    "\t<a href=\"https://docs.python.org/2/tutorial/\" target=\"_blank\">https://docs.python.org/2/tutorial/</a><br/>\n" +
                    "\t<a href=\"http://www.learnpython.org/\" target=\"_blank\">http://www.learnpython.org/</a><br/>\n" +
                    "\t<a href=\"http://www.tutorialspoint.com/python/\" target=\"_blank\">http://www.tutorialspoint.com/python/</a><br/>\n" +
                    "\t<a href=\"http://artint.info/html/ArtInt_262.html\" target=\"_blank\">http://artint.info/html/ArtInt_262.html</a><br/>\n" +
                    "\t<a href=\"http://reinforcementlearning.ai-depot.com/Intro.html\" target=\"_blank\">http://reinforcementlearning.ai-depot.com/Intro.html</a><br/>\n" +
                    "\t<a href=\"http://www.cs.dartmouth.edu/~lorenzo/teaching/cs134/Archive/Spring2009/final/PengTao/final_report.pdf\" target=\"_blank\">http://www.cs.dartmouth.edu/~lorenzo/teaching/cs134/Archive/Spring2009/final/PengTao/final_report.pdf</a><br/>\n" +
                    "</p>",
    };

    public static MyMenu event_list[] = new MyMenu[]
            {
                    new MyMenu(R.drawable.reversecoding, "Reverse Coding"),
                    new MyMenu(R.drawable.webdev, "Web Dev"),
                    new MyMenu(R.drawable.odetocode, "Ode to Code"),
                    new MyMenu(R.drawable.dialemma, "Learner's Dilemma"),
            };

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        MainActivity.state = 1;
        ((MainActivity) getActivity()).getSupportActionBar().setTitle(EventFragment.event_list[getArguments().getInt("POSITION")].title);
        View v = inflater.inflate(R.layout.event_fragment, container, false);
        ListView lv = (ListView) v.findViewById(R.id.event_listview);
        EventAdapter adapter = new EventAdapter(this.getActivity(), R.layout.event_list_row, event_list);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                ((MainActivity)getActivity()).getSupportActionBar().setTitle(event_list[position].title);
                selectItem(position);
            }
        });
        return v;
    }

    private void selectItem(int position){
        FragmentManager fm = getFragmentManager();
        Bundle args = new Bundle();
        args.putInt("POSITION", position);
        CodeSubFragment fragment = new CodeSubFragment();
        fragment.setArguments(args);
        fm.beginTransaction().replace(R.id.fr1, fragment).addToBackStack("Auto-sub").commit();
    }
}


