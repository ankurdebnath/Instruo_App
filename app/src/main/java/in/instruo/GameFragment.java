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
import android.widget.TextView;

/**
 * Created by Focus on 28-Mar-15.
 */
public class GameFragment extends Fragment {

    /*hardcoded desc. Get in json format from API instead.*/
    public static String desc [] = {
            "Feel the adrenalin rush as you go neck and neck against your opponent." +
            "<h3>General Rules:</h3><br>\n" +
                    "<p>1.There will be 4 rounds.<br>\n" +
                    "2. All the rounds will be played on Need for Speed Most Wanted.<br>\n" +
                    "3. Provide the players with a full profile.<br>\n" +
                    "4. No Cheats will be tolerated.<br>\n" +
                    "5. Players can bring their peripherals such as mouse, headphones, keyboards etc. <br>\n" +
                    "6. Event team reserves the right to change any rules as per the situation and if so then that will be intimated to the players on the spot.<br>\n" +
                    "<h3>Round 1:</h3> <br>\n" +
                    "RACE TYPE : SPRINT<br>\n" +
                    "All the players will be provided with the same car. At a time 4 players will compete among them.\n" +
                    "Top 2 players will be selected for the next round.\n" +
                    "<h3>Round 2:</h3><br>\n" +
                    "RACE TYPE : SPRINT (LONG)<br>\n" +
                    "All the players will be provided with the car of their choice. At a time 4 players will compete among them.\n" +
                    "Top 1 player will be selected for the next round.\n" +
                    "<h3>Round 3:</h3><br>\n" +
                    "RACE TYPE : CIRCUIT (2 LAPS)<br>\n" +
                    "All the players will be provided with the car of their choice. At a time 4 players will compete among them.\n" +
                    "Top 1/2 player will be selected for the next round.\n" +
                    "<h3>Round 4:</h3><br>\n" +
                    "RACE TYPE : CIRCUIT (3 LAPS)<br>\n" +
                    "All the players will be provided with the car of their choice. At a time 4 players will compete among them.\n" +
                    "Top 1 player will be selected as the winner after defeating all the other players.\n" +
                    "</p>",
            "Keep those head shots coming!"+
            "<h3>Rules and Regulations:</h3>\n" +
            "1. The team playing as the Terrorist side first will be announced before the match or decided by knife round. <br>\n" +
            "2. Official Maps: De_Dust2, De_Inferno, De_Nuke, De_Train, De_Aztec. <br>\n" +
            "3. Approved Grenade Amounts Per Round<br>\n" +
            "a) Flashbangs: 2<br>\n" +
            "b) Grenades: 1<br>\n" +
            "c) Smoke Grenades: 1<br>\n" +
            "4. Shotguns , Shields, Automatic Sniper is not allowed.<br>\n" +
            "5. Any player or team caught breaking a rule or performing an infraction will be subject to disqualification.<br>\n" +
            "The match will consist of 3 rounds and each round shall be according to the following rules:<br>\n" +
            "30 Rounds (Max rounds format): <br>\n" +
            "15 rounds as Terrorists and 15 rounds as Counter-Terrorists per team <br>\n" +
            "(If a team wins 16 rounds first, the match is ended immediately.)<br>\n" +
            "<h3>Victory condition:</h3>\n" +
            "The first team to win 16 rounds. <br>\n" +
            "1. In the case of a tie after the regulation rounds end, 6 extra rounds will be played.<br>\n" +
            "2. (3 rounds as Terrorists / 3 rounds as Counter-Terrorists per team)<br>\n" +
            "3. In the case of yet another tie after the 6 extra rounds, as stated above, 6 additional extra rounds will be played until the tie is broken.<br>",
            "Keep you eye on the goal"+
                    "<h3>General Rules:</h3>\n" +
                    "1. There will be 4 rounds. <br>\n" +
                    "2. Players can bring in their own keyboards or gamepads.However no gamepads shall be provided.<br>\n" +
                    "3. Players are to play with the default team squads.<br>\n" +
                    "4. The player ratings shall be set to their default value.<br>\n" +
                    "<h3>Game settings:</h3>\n" +
                    "1. Preferably default but may be changed by the player.<br>\n" +
                    "2. Cross settings must be set to automatic.<br>\n" +
                    "3. Controller settings shall be user defined.<br>\n" +
                    "4. Each half shall be of 5 minutes.<br>\n" +
                    "5. offsides-ON<br>\n" +
                    "6. Handball-ON<br>\n" +
                    "7. Injuries-OFF<br>\n" +
                    "<h3>Round 1:</h3>\n" +
                    "1. each player has to play a 1v1 match against the cpu<br>\n" +
                    "2. the level of the cpu shall be set to WORLD CLASS..<br>\n" +
                    "3. Players need to play an international match against Italy.<br>\n" +
                    "4. in case of a draw between the player and the cpu,the match shall last for 120 mins in total and still if there is a draw then a penalty shootout shall take place.<br>\n" +
                    "5. in case of a draw between two players shots on target,ball possession etc shall be taken into account.<br>\n" +
                    "<h3>Round 2:</h3>\n" +
                    "1. Players shall play a 1v1 match on the LAN.<br>\n" +
                    "2. Players can only choose club teams only.<br>\n" +
                    "3. The rules for a draw are same as above.<br>\n" +
                    "<h3>Round 3:</h3>\n" +
                    "1. Players shall play a 1v1 match on the LAN.<br>\n" +
                    "2. Players can only choose club teams only.<br>\n" +
                    "3. The rules for a draw are same as above.<br>\n" +
                    "<h3>Round 4:</h3>\n" +
                    "1. Players shall play a 1v1 match on the LAN.<br>\n" +
                    "2. Players can only choose from among the national teams only.<br>\n" +
                    "3. The rules for a draw are same as above.<br>",
            "<h3>Introduction</h3>\n" +
                    "<p>\n" +
                    "\tCombinations have always been the most intriguing aspect of Chess.\n" +
                    "\tThe masters look for them, the public applauds them, the critics\n" +
                    "\tpraise them. It is because combinations are possible that Chess\n" +
                    "\tis more than a lifeless mathematical exercise. They are the\n" +
                    "\tpoetry of the game; they are to Chess what melody is to\n" +
                    "\tmusic. They represent the triumph of mind over matter\n" +
                    "\tThe tactician must know what to do whenever something needs doing ,the strategist must know what to do when nothing needs doing. These are not pieces, they are men! For any man to walk into the line of fire will be one less man in your army to fight for you. Value every troop and use him wisely, throw him not to the dogs as he is there to serve his King. Are you ready to be that king ? Instruo 2015 presents Checkmate. Be the strategist or the tactician and claim your victory over your opponent’s army. It is said that\n" +
                    "\tMany have become chess masters; no one has become the master of chess.\n" +
                    "\tAre you the master of chess? Prove it!\n" +
                    "</p>\n" +
                    "\n" +
                    "<h3>Rules</h3>\n" +
                    "<p>\n" +
                    "1. Registration fees of Rs.50 has to be paid on-spot for participation in the event.<br/><br/>\n" +
                    "\n" +
                    "2. Participants should possess the receipt of the payment for entry into the venue.<br/><br/>\n" +
                    "\n" +
                    "3. The players are not permitted to bring into the playing area technical and other equipment extraneous to play, including mobile phones, which may in any way disturb or upset the opponent. The Chief Arbiter shall decide what constitutes extraneous equipment liable to offend the opponent.<br/><br/>\n" +
                    "</p>\n" +
            "<h3>Contacts</h3>\n" +
                    "<p>\n" +
                    "SOUMYAJEET PATRA : 8697573139 <br/>\n" +
                    "SWATI BHATTACHARYA: 8981930328 <br/>\n"+
                    "TUHIN GHOSH: 9088012445<br /></p>",
    };

    public static MyMenu event_list[] = new MyMenu[]
            {
                    new MyMenu(R.drawable.nfs, "Need For Speed"),
                    new MyMenu(R.drawable.counterstrike, "Counter Strike"),
                    new MyMenu(R.drawable.fifa, "FIFA"),
                    new MyMenu(R.drawable.chess, "Checkmate"),
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
        GameSubFragment fragment = new GameSubFragment();
        fragment.setArguments(args);
        fm.beginTransaction().replace(R.id.fr1, fragment).addToBackStack("Auto-sub").commit();
    }
}
