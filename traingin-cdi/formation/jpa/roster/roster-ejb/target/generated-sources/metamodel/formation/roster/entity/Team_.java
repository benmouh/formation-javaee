package formation.roster.entity;

import formation.roster.entity.League;
import formation.roster.entity.Player;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2021-05-20T08:46:49")
@StaticMetamodel(Team.class)
public class Team_ { 

    public static volatile SingularAttribute<Team, String> city;
    public static volatile CollectionAttribute<Team, Player> players;
    public static volatile SingularAttribute<Team, League> league;
    public static volatile SingularAttribute<Team, String> name;
    public static volatile SingularAttribute<Team, String> id;

}