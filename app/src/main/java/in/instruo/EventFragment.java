package in.instruo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Created by Focus on 25-Dec-14.
 */
public class EventFragment extends Fragment {

    private static String junkE  = "<h3>Introduction</h3>\n" +
            "Do you have creativity? Innovative Thinking? \n" +
            "Interested in Mechanics? \n" +
            "Just make a group and stand for the JUNKYARD CHALLENGE – 2015!\n" +
            "All are invited…\n" +
            "\n" +
            "<h3>Rules</h3>\n" +
            "<p>\n" +
            "Maximum Team Members: 5, Minimum: 3\t\n" +
            "</p>\n" +
            "\n" +
            "<b>Round 1</b>\n" +
            "<p> Preliminary Round (Day 1: 04/04/15) <br/><br/>\n" +
            "There will be 60 MCQs of each marks 3 and 7 Descriptive Questions each of marks 10 you have to answer it within 2 hrs. <br/>\n" +
            "Best 5 teams who will score highest will be selected for Round 2. <br/><br/>\n" +
            "Note:<br/>\n" +
            "There will be negative marking in MCQs: (-1) for each negative answer. <br/>\n" +
            "Step Markings will be given for proper approach to solve the Descriptive Problems.<br/>\n" +
            "</p>\n" +
            "\n" +
            "<b>Round 2</b>\n" +
            "<p>\n" +
            "Junkyard Final Round (Day 2: 05/04/15)<br/><br/>\n" +
            "You have to do innovative creation. A task will be given to you. You must complete it within a particular time. The process and the task will be declared in details on the 2nd day (Final Round) along with the 5 finalists’ names.<br/>\n" +
            "</p>\n" +
            "\n" +
            "<h3>Contact</h3>\n" +
            "<p>\n" +
            "Subham Shit: +918972609347, (email: subham.spike2@gmail.com)<br/>\n" +
            "Rahul Ghosh: +919614934017, (email: rahulbesume@gmail.com)<br/>\n" +
            "Aritra Chatterjee: +918017272337, (email: aritra.snape@gmail.com)<br/>\n" +
            "</p>";
    private static String waroftitans = "<h3>Introduction</h3>\n" +
            "<p>\n" +
            "Zeus, Poseidon, Hades and many other Titans have gathered in heaven to sort things out between them. They have found an Arena where they will straighten the curves. INSTRUO 2015 presents to you the WAR OF THE TITANS. You can be a part of the battle and claim your crown... Which GOD are you???\n" +
            "</p>\n" +
            "\n" +
            "<h3>Rules</h3>\n" +
            "<p>\n" +
            "The first round of War of the Titans is Bind Mogglers which is a Pen and Paper round. Each team will be asked to solve aptitude based questions...the second round will be kind of interview round conducted by the judges...and the final and most exciting round is the auction round where each selected team has to earn point by bidding and buying products...\n" +
            "</p>\n" +
            "\n" +
            "<h4>Event rules</h4>\n" +
            "<p>\n" +
            "The event will be organized in three rounds:<br><br>\n" +
            "1. Bind Mogglers (Elimination round):<br>\n" +
            "Pen and Paper round. Each team will be asked to solve aptitude based questions.<br><br>\n" +
            "2. Interview round:<br>\n" +
            "The selected teams will be interviewed by the judges.<br><br>\n" +
            "3. Auction Round:<br>\n" +
            "The final and most exciting round is the auction round where each selected team has to earn point by bidding and buying products.\n" +
            "</p>\n" +
            "<h4>General rules</h4>\n" +
            "<p>\n" +
            "1. The teams can comprise to a maximum of 3 members and minimum of 2 members however one member cannot be a part of two different teams. <br/><br>\n" +
            "2. Students from any department can take part in the contest. <br/><br>\n" +
            "3. Students from different institutes can form a team. <br/><br>\n" +
            "4. Only materials and facilities provided by the organizing team are to be used, violations will lead to disqualification, in cases where the organizing team feels that other materials are required, relaxations will be made. <br/><br>\n" +
            "5. No extra time will be allowed. <br/>\n" +
            "</p>\n" +
            "<h3>Contacts</h3>\n" +
            "Bitan Das: 9874218513 <br>\n" +
            "Indraneel Mitra: 9051736370 <br>\n" +
            "<p>";
    private static String mathemania = "<h3>Introduction</h3>\n" +
            "Guys, Do you calculate your girlfriend’s shopping bill faster than a calculator? Girls, can you draw a graphical representation of the likes your profile picture gets on social media? For all the math wizards out there, this is your event. Calculate, apply logic and get paid!"+
            "<h3>Rules:</h3>\n" +
            "<p>\n" +
            "The competition will be held in 2 stages: <br>\n" +
            "<h3>Prelims: </h3>\n" +
            "1. There will be a 1 hour MCQ test based on Higher Secondary level Mathemetics, Statistical Analysis, Data Interpretation and other Analytical questions. <br>\n" +
            "2. Top 20 candidates will qualify for the Finals. <br>\n" +
            "3. In case of a Tie, the one with lesser number of negative attempts would be given preference. <br>\n" +
            "<h3>Finals: </h3>\n" +
            "1. The finals would consist of subjective questions based on the topics as mentioned above. <br>\n" +
            "2. It would be a 1 hour test. <br>\n" +
            "3. In case of a Tie, the scores of the 1st round would be considerd. <br>\n" +
            "</p>"+
            "<h3>Contacts</h3>\n" +
            "<p>\n" +
            "BISWAJYOTI CHOUDHURI : 8967874165 <br/>\n" +
            "ABHISHEK MAHATO: 9932826235<br /></p>";

    private static String faceoff = "<h3>Introduction</h3>\n" +
            "Asserting your opinion has never been this rewarding. Think your cogent demeanour can find you a place at the crest of the War of Words? Then this is your event."+
            "<h3>Rules</h3>\n" +
            "<p>1. The registrations for this event will be on spot.<br /> 2. Each team must have two members.<br /> 3. There will be two rounds, both on the same day on Apria 5th.<br /> 4. First Round will be an impromptu round, where one speaker from each team will be asked to speak on an unseen topic for 2 minutes. <br /> 5. Based on Impromptu Round, 8 teams will be selected for the Oxford Style Debate.</p>";

    private static String electrinicaz = "<h3>Introduction</h3>\n" +
            "If you have spent your childhood breaking apart the radio or your dad's favourite cassette player then this is an event you'll thoroughly enjoy."+
            "<h3>Rules</h3>\n" +
            "<h4>Event Rules</h4>\n" +
            "<p>The competition will be held in three stages.<br /> <strong>Round 1:</strong><br /> 1.There will be a forty five minute objective type test on the fundamentals of Analog &amp; Digital electronics, Communication and Network Theory. <br /> Selected teams from this round will proceed to the next round. <br /> <strong>Round 2:</strong><br /> 1. Herein the participants will try to perform hardware implementation of a design problem, either from Analog or from digital electronics that will be given on the spot.<br /> 2. The maximum number of chips available for any team will be specified.<br /> 3. The ICs allowed to be used will be specified beforehand.<br /> 4. Before connecting the power supply, the circuit has to be approved by the judge.<br /> 5. The ICs provided will be classified as basic and high level. This classification is final.<br /> 6. The participants will be given a maximum of ninety minute to complete this circuit.</p>\n" +
            "<h4>General Rules</h4>\n" +
            "<p>1. The complete event is an on spot event and all the rounds would be held at IIEST, Shibpur during Instruo 2015. <br /> 2. Electronikaz is restricted to students currently pursuing their education in any recognized educational institute. 3. A maximum of two participants can combine to form a team. <br /> 4. Students from different colleges can be a part of the same team. </p>\n" +
            "<h3>Contacts</h3>\n" +
            "<p>Subham Kumar Bhagat: +918100880693<br /> Rhitam Datta: +919831723619</p>";

    private static String planmasters = "<h3>Introduction</h3>\n" +
            "“Innovation distinguishes a leader from a follower “. Tired of Campus Placements? Want to sit on the other side of the interview table? Show us your innovative business side and entice your competitors how to rule the market."+
            "<h3>Rules</h3>\n" +
            "<h4>RULES FOR PRELIMS</h4>\n" +
            "<p>1. A team can comprise a maximum of 5 members. <br /><br /> 2. Each team has to submit the abstract of the proposed idea in a PDF format to souvik.iiestS@gmail.com . Mention the name of the Business Venture/Idea along with the team members in the Cover Page of the abstract. Font size should be 12 throughout, except the headings and sub headings. <br /><br /> 3. The idea should incorporate a short description of the business plan. The skeleton should at least consist of: <br /><br /> &nbsp;&nbsp;&nbsp;&nbsp;a. The mission statement <br /> &nbsp;&nbsp;&nbsp;&nbsp;b. Products or services offered <br /> &nbsp;&nbsp;&nbsp;&nbsp;c. Overview of the marketing and sales <br /> &nbsp;&nbsp;&nbsp;&nbsp;d. Financials <br /> &nbsp;&nbsp;&nbsp;&nbsp;e. Competitive analysis and advantage <br /> &nbsp;&nbsp;&nbsp;&nbsp;f. Future goals <br /><br /> Other features like Need Gap Analysis, SWOT Analysis etc. can be included, depending on the decision of the team members. <br /><br /> 4. Last date of submission of the abstract is - 1st April, 2015 (11:59 PM). No submissions shall be accepted thereafter.</p>\n" +
            "<h4>RULES FOR FINALS</h4>\n" +
            "<p>The Finals shall be conducted in 2 rounds:<br /><br /> <strong>ROUND 1</strong><br /> The top 8 qualifying teams shall get 8 minutes to present their idea, in the form of a Presentation or a video or a flash game or any means of their choice.<br /><br /> This shall be followed by 3 minutes of questions and answers, wherein the members of the jury or the audience can question any aspect of the proposed business idea. <br /><br /> <strong>ROUND 2 </strong><br /> The top 6 teams from Round 1 qualify for Round 2, which shall be the Elevator Pitch Round.<br /><br /> In this, the teams will have to pitch their ideas to the jury, in 2 minutes, with an aim to seek investment.<br /><br /> Use stories and action is allowed in this Elevator Pitch Round.<br /><br /> The Elevator Pitch Round requires the top 6 teams to be concise and hard hitting. Teams need to convince the jury members to invest in their idea or garner their interest by the end of the 2 minutes.<br /><br /> At the end of ROUND 1 and ROUND 2, The winner, based on the aggregate of the scores of both the rounds, shall be crowned as the Plan Master of Instruo 2015!</p>\n" +
            "<h3>Contacts</h3>\n" +
            "<p>Souvik Maity: 9674117285 (email: sukovi28295@gmail.com)</p>";

    private static String bizathelon = "<h3>Rules</h3>\n" +
            "<p>\n" +
            "1. Each team can comprise a maximum of 2 members.<br/><br/>\n" +
            "2. The Quiz is open only to participants under 25 years of age. (All participants will have to bring a valid ID card)<br/><br/>\n" +
            "3. 8 teams make it to the finals.<br/><br/>\n" +
            "4. The decision of the Quizmaster is final and binding. <br/><br/>\n" +
            "</p>\n" +
            "\n" +
            "<h3>Rules for Registration </h3>\n" +
            "<p>\n" +
            "a. INR 50 per quiz for college students (Relevant ID cards need to be carried by the participants).<br/><br/>\n" +
            "b. INR 100 per quiz for non college students.<br/><br/>\n" +
            "</p>";

    private static String prasnavali = "<h3> Rules</h3>\n" +
            "<p>\n" +
            "1. Each team can comprise a maximum of 4 members.<br/><br/>\n" +
            "2. The Quiz is open only to participants under 25 years of age. (All participants will have to bring their valid ID cards).<br/><br/>\n" +
            "3. 8 teams make it to the finals.<br/><br/>\n" +
            "4. The decision of the Quizmaster is final and binding.<br/><br/>\n" +
            "</p>";

    private static String airothrill = "<h3>Introduction</h3>\n" +
            "Wingardium Leviosa! Unfortunately things aren't so easy in real life, but when you do get an object to hover the results are pretty spectacular."+
            "<h3>Model Specifications</h3>\n" +
            "<p>\n" +
            "\t1. The models should be handmade. Hovercrafts assembled from kits are strictly prohibited.\n" +
            "\t<br>\n" +
            "\t2. Ready-to-Fly and Almost-Ready-to-Fly base vehicles/kits cannot be used.\n" +
            "\t<br>\n" +
            "\t3. Maximum dimensions of the hovercraft should not exceed 50 cm X 50 cm X 50 cm. (After all the parts have been deployed).\n" +
            "\t<br>\n" +
            "\t3. There is no limitation on weight.\n" +
            "\t<br>\n" +
            "\t4. Electronic equipment such as ESCs, electric motors, servos etc. can be purchased.\n" +
            "\t<br>\n" +
            "\t5. Maximum voltage across any 2 points in the bot should not exceed 12 V.\n" +
            "\t<br>\n" +
            "\t6. Internal combustion engines are strictly prohibited.\n" +
            "\t<br>\n" +
            "\t7. Metal propellers are not allowed.\n" +
            "</p>\n" +
            "<h4>Note</h4>\n" +
            "\t<p>\n" +
            "\t\t1. The use of 2.4 GHz radio is required for all aircraft competing in the competition. If the participants want to use any other frequency, they will have to inform the organizers in advance.\n" +
            "\t\t<br>\n" +
            "\t\t2. A limited number of 2.4 GHz radios will be available with the organizers for use by the teams. Teams which do not have access to radios can inform the organizers in advance to request use of these radios.\n" +
            "\t\t<br>\n" +
            "\t\t3. Participants will be given chance to practice but should inform earlier.\n" +
            "\t\t<br>\n" +
            "\t</p>\n" +
            "\n" +
            "<h3>General Rules</h3>\n" +
            "\n" +
            "<p>\n" +
            "\t1. The organizers reserve all rights to change any or all of the above rules. Changes will be highlighted on the website. However, you are suggested to keep checking the website regularly.\n" +
            "\t<br>\n" +
            "\t2. Only one attempt in the arena will be given. No another chance will be provided. You have to race your hovercraft in a single go. Please fine-tune your hovercrafts before the race.\n" +
            "\t<br>\n" +
            "\t3. In Round 2 and Round 3, time-out of 1 minute will be provided only in the condition when both the hovercrafts are stuck(both are immobile) i.e. both need a time out.\n" +
            "\t<br>\n" +
            "\t<br>\n" +
            "\tPenalty\n" +
            "\t<br>\n" +
            "\t<br>\n" +
            "\tWhenever participants touch their bot they will need to place their bot back to the last checkpoint it has crossed. Race will continue during this period of time and the time lost during placing the bot back at the checkpoint will not be adjusted.\n" +
            "\t<br>\n" +
            "\tIf the dimensions of the bot exceeds the allowed dimensions (i.e. 50x50x50 cm) but lie under (55x55x55 cm) then a penalty of 10 seconds is imposed and if it exceeds even more than (55x55x55 cm), then that bot is straight away not allowed to race.\n" +
            "\t<br><br>\n" +
            "\t4. To prevent interference between transmitters during the race, the participants must use remote with frequency of band spectrum 2.4 GHz.\n" +
            "\t<br>\n" +
            "\t5. The participants are allowed to bring more than one hovercraft.\n" +
            "\t<br>\n" +
            "\t6. Within the same round/set the participants are not allowed to change their hovercraft.\n" +
            "\t<br>\n" +
            "\t7. Participants are strongly suggested to bring spare parts to replace damages. Extra batteries must also be brought for backup.\n" +
            "\t<br>\n" +
            "\t8. Only charging points will be provided by the Instruo team. So participants must bring their charging equipment.\n" +
            "\t<br>\n" +
            "\t9. The hovercraft must not contain any structure or modification which damages other hovercrafts or harms the audience. The decision regarding the same will be made by the referee and will be deemed as final and binding.\n" +
            "\t<br>\n" +
            "\t10. Transmitter can be ready made or hand made.\n" +
            "\t<br>\n" +
            "\t11. The decisions made by the referees will be final. They cannot be questioned or claimed for any of their decisions.\n" +
            "\t<br>\n" +
            "\t12. Any misbehavior or breach of the code of conduct will lead to disqualification of the team from the event and also their participation in the Instruo’15 will be affected.\n" +
            "\t<br>\n" +
            "\t13. The organizers reserve all rights to change any or all of the above rules. The participants must regularly keep checking the website for updates. Any change on the website will be highlighted.\n" +
            "\t<br>\n" +
            "</p>\n" +
            "\n" +
            "<h3>Team Structure</h3>\n" +
            "<p>A team can consist of maximum 5 members. Students from different colleges can form a team.\n" +
            "<br>\n" +
            "</p>\n" +
            "<h3>Event Structure</h3>\n" +
            "<h4>Round 1 - Qualifying Round</h4>\n" +
            "<p>\n" +
            "1. A chance to show how your bot is hovering and capable enough to participate in the next round.\n" +
            "<br>\n" +
            "2. Each team will have to race their bots on the provided track for one lap and the lap time will be taken into consideration.\n" +
            "<br>\n" +
            "3. 1 or 2 bots (as per requirements) will move at a time from different starting point and their individual lap time will be noted.\n" +
            "<br>\n" +
            "4. Top 12 teams on the basis of minimum lap time will qualify for the second round.\n" +
            "<br>\n" +
            "5. All the teams will be assigned a team name on the basis of their performance in the qualifying round. e.g.: (Team 1 – team having best time, Team 2 – team having second best time and so on).\n" +
            "<br>\n" +
            "</p>\n" +
            "\n" +
            "<h4>Round 2 - Hurdle/Obstacle Round</h4>\n" +
            "<p>\n" +
            "\t\n" +
            "\t\t1. Top 12 teams from round 1 will be selected for round 2.\n" +
            "\t\t<br>\n" +
            "\t\t2. These teams will be further divided into 4 groups accordingly :<br>\n" +
            "<b>Group A: </b> Team 1, Team 5, Team 9\n" +
            "<b>Group B: </b> Team 2, Team 6, Team 10\n" +
            "<b>Group C: </b> Team 3, Team 7, Team 11\n" +
            "<b>Group D: </b> Team 4, Team 8, Team 12<br>"+
            "\t\t3. This round will be a League Round, where each team will race against every team in its group.\n" +
            "\t\t<br>\n" +
            "\t\t4. There will be race having 2 laps. The team which completes both the laps first will win the race.\n" +
            "\t\t<br>\n" +
            "\t\t5. 3 points will be awarded to the winning team where as to the loosing team, no points will be awarded. If there is a tie between the two teams, one point is awarded to both the teams.\n" +
            "\t\t<br>\n" +
            "\t\t6. The overall winners of each group (team having the maximum points) will move ahead to the Round 3.\n" +
            "\t\t<br>\n" +
            "\t\t7. Total time of all races in round 2 will be taken into account in case there is a tie of position between two or more teams\n" +
            "\t\t<br>\n" +
            "</p>\n" +
            "<h4>Round 3 - Final Round</h4>\n" +
            "<p>\n" +
            "\t1. For this Round, we are having four teams. (Winners from each group).\n" +
            "\t<br>\n" +
            "\t2. These four teams will again be assigned positions according to their total time in round 2. e.g.: (Team 1 – team having best time, Team 2 – team having second best time and so on).\n" +
            "\t<br>\n" +
            "\t3. Qualifier 1: The first two teams (i.e. Team 1 and Team 2) will race against each other and the winner will get direct entry to the final race.\n" +
            "\t<br>\n" +
            "\t4. Eliminator: The rest of the two teams (i.e. Team 3 and Team 4) will race against each other.\n" +
            "\t<br> \n" +
            "    5. The losing team will be eliminated and the winner will get entry to qualifier-2. \n" +
            "    <br>\n" +
            "\t6. Qualifier 2: The losing team of qualifier-1 and the winner of eliminator will race against each other, to qualify for the final race. \n" +
            "\t<br>\n" +
            "\t7. Finale: It will be the final battle between winners of qualifer1 and qualifier2.\n" +
            "\t<br>\n" +
            "\n" +
            "</p>\n";

    private static String wiredin = "<h3>Introduction</h3>\n" +
            "<p>\n" +
            "Circuits is what you dream of? INSTRUO 15 brings you a challenge to test your circuit designing skills where you and your team builds a circuit which can take on real life  problem..!\n" +
            "<p/>\n" +
            "\n" +
            "<h3>Rules</h3>\n" +
            "<p>\n" +
            "<h4>Event rules</h4>\n" +
            "There are two rounds in this event.<br/><br/>\n" +
            "\n" +
            "<b>Preliminaries:</b><br/>\n" +
            "Your  team is handed a  paper comprising mcq’s that test their knowledge in circuit theory, basic  ee, basic electronics, etc.<br/><br/>\n" +
            "\n" +
            "<b>Finals:</b><br/>\n" +
            "Qualifying teams face off and design your circuit for real life problem statements on a breadboard, on paper or simulate in your Laptop as the question demands!! \t<br/><br/>\n" +
            "\n" +
            "<h4>General rules</h4>\n" +
            "1. Each team may have min 3 and max 5 members.<br/>\n" +
            "2. Registration is on-spot.<br/>\n" +
            "3. Each team must have a laptop loaded with simulation software like PSPICE, CIRCUIT WIZARD or MULTISIM. <br/>\n" +
            "4. It is preferred to carry your own breadboard, multi-meter and 2 9V cells if finals have an additional <br/>design round as well. Any other equipment if required will be provided.\n" +
            "5. Accessing the internet during the Finals round is allowed to gather resources. <br/>\n" +
            "</p>\n" +
            "<h3>Contacts</h3>\n" +
            "<p>\n" +
            "Partha Pratim Dutta: 9433042238<br/>\n" +
            "Souptik Mukhopadhyay: 9477523094, 8013616067<br/>\n" +
            "Sayak Chakraborty: 8981882754<br/>\n" +
            "</p>";

    private static String papyrus = "<h3>Introduction</h3>\n" +
            "Come as a pedestrian walk out as a patent holder. The right place to show off your geek side. Time to lay your ideas on the table and get handsomely rewarded!"+
            "<h3>Rules</h3>\n" +
            "<p>1. On spot Registration.<br /> 2. Each team should have at most 3 members.<br /> 3. Teams should present their novel work in any academic field relating to engineering, economics and science.<br /> 4. PowerPoint presentation is mandatory.<br /> 5. Each team will be given 15 minutes to put forth their ideas. </p>";
    public static String desc [] = {
            "",
            "",
            "",
            bizathelon,
            prasnavali,
            electrinicaz,
            wiredin,
            waroftitans,
            junkE,
            airothrill,
            papyrus,
            faceoff,
            mathemania,
            planmasters,
    };

    public static MyMenu event_list[] = new MyMenu[]
            {
                    new MyMenu(R.drawable.pic17, "Automaton"),
                    new MyMenu(R.drawable.pic2, "Game On"),
                    new MyMenu(R.drawable.coding, "Coding"),
                    new MyMenu(R.drawable.biz, "Bizathelon"),
                    new MyMenu(R.drawable.pic14, "Prasnavali"),
                    new MyMenu(R.drawable.pic9, "Electronicaz"),
                    new MyMenu(R.drawable.wiredin, "Wired In"),
                    new MyMenu(R.drawable.pic7, "War of the Titans"),
                    new MyMenu(R.drawable.pic15, "Junkyard Challenge"),
                    new MyMenu(R.drawable.picracing, "Air-o-Thrill"),
                    new MyMenu(R.drawable.pic10, "Papyrus"),
                    new MyMenu(R.drawable.pic4, "FaceOff"),
                    new MyMenu(R.drawable.pic11, "MathMania"),
                    new MyMenu(R.drawable.pic6, "Plan Masterz"),
            };



    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentManager fm = getFragmentManager();
        if(fm.getBackStackEntryCount() > 1)
            fm.popBackStack();
        Log.d("DEBUG", "Event Added");
        if (fm.getBackStackEntryCount() > 0)
            MainActivity.state = 1;
        else
            MainActivity.state = 0;
                ((MainActivity) getActivity()).getSupportActionBar().setTitle(MainActivity.menu_list[getArguments().getInt("POSITION")].title);
        ViewGroup v = (ViewGroup) inflater.inflate(R.layout.event_fragment, container, false);
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
//


    private void selectItem (int position){
       FragmentManager fm = getFragmentManager();
       Bundle args = new Bundle();
       args.putInt("POSITION", position);
       switch (position){
           case 1:  GameFragment fragment = new GameFragment();
                    fragment.setArguments(args);
                    fm.beginTransaction().replace(R.id.fr1, fragment).addToBackStack("Game").commit();
                    break;
           case 0:  AutomationFragment fragment2 = new AutomationFragment();
                    fragment2.setArguments(args);
                    fm.beginTransaction().replace(R.id.fr1, fragment2).addToBackStack("Auto").commit();
                    break;
           case 2:  CodeFragment fragment3 = new CodeFragment();
                    fragment3.setArguments(args);
                    fm.beginTransaction().replace(R.id.fr1, fragment3).addToBackStack("Code").commit();
                    break;
           default:  PlanMastersFragment fragment1 = new PlanMastersFragment();
                    fragment1.setArguments(args);
                    fm.beginTransaction().replace(R.id.fr1, fragment1).addToBackStack("Plan").commit();
                    break;
       }

   }

        @Override
        public void onStop() {
            super.onDestroy();
        }
}

