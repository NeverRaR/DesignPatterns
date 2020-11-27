package Converter;

class MembershipConverter extends Converter<MembershipDto, Membership> {

    public MembershipConverter() {
        super(MembershipConverter::convertToEntity, MembershipConverter::convertToDto);
    }

    private static MembershipDto convertToDto(Membership membership) {
        return new MembershipDto(membership.getFirstName(), membership.getLastName(), membership.isActive(), membership.getMembershipId());
    }

    private static Membership convertToEntity(MembershipDto dto) {
        return new Membership(dto.getFirstName(), dto.getLastName(), dto.isActive(), dto.getEmail());
    }

}
