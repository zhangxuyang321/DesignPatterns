package behaviorType.mediator;

import java.util.ArrayList;
import java.util.List;

public class PartyImpl implements Party {

    private final List<PartyMember> members;

    public PartyImpl() {
        members = new ArrayList<>();
    }

    @Override
    public void addMember(PartyMember member) {
        members.add(member);
        member.joinedParty(this);
    }

    @Override
    public void act(PartyMember actor, Action action) {
        for (PartyMember me : members) {
            if (!me.equals(actor)) {
                me.partyAction(action);
            }
        }
    }
}
