package peaksoft.models;

public class Group {
    private Long id;
    private String groupName;
    private String description;

    public Group(Long id, String groupName, String description) {
        this.id = id;
        this.groupName = groupName;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Group{" +
               "id=" + id +
               "groupName='" + groupName + '\'' +
               "description='" + description + '\'' +
               '}';
    }
}
