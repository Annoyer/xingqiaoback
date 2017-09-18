package controller;

import model.OrganizationWithBLOBs;
import model.OrganizationviewWithBLOBs;
import model.OrgintroWithBLOBs;
import org.apache.ibatis.annotations.Param;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import service.OrganizationService.IOrganizationService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by joy12 on 2017/9/16.
 */
@Controller
public class OrganizationController {
    @Resource
    IOrganizationService organizationService;

    @RequestMapping(value = "/jsp/organizations")
    public ModelAndView toOrders() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("organizations");
        mv.addObject("organizations", organizationService.getAllOrganizationsFromView());
        return mv;
    }

    @RequestMapping(value = "/jsp/getSingleOrg", method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> getSingleOrg(@RequestParam("organizationId") Integer orgId) {
        Map<String,Object> result = new HashMap<>();
//        result.put("orgbrief",organizationService.getOrganizationById(orgId));
        result.put("result","success");
        result.put("orgintro",organizationService.getOrgintroById(orgId));
        return result;
    }

    @RequestMapping(value = "/jsp/addOrg", method = RequestMethod.POST)
    public ModelAndView addOrg(HttpServletRequest request) throws UnsupportedEncodingException {
        request.setCharacterEncoding("UTF-8");
        OrganizationWithBLOBs organization = new OrganizationWithBLOBs();
        System.out.println("abs::" + request.getParameter("abstract"));
        organization.setName(request.getParameter("name"));
        organization.setNumpeople(Integer.parseInt(request.getParameter("numPeople")));
        organization.setProvince(request.getParameter("province"));
        organization.setCity(request.getParameter("city"));
        organization.setDistrict(request.getParameter("district"));
        organization.setAbstract("xxx");
        organization.setIntroduce("xxx");
        OrgintroWithBLOBs orgintro = new OrgintroWithBLOBs();
        orgintro.setAbstract(request.getParameter("abstract"));
        orgintro.setAddress(request.getParameter("address"));
        orgintro.setCourse(request.getParameter("course"));
        orgintro.setHardware(request.getParameter("hardware"));
        orgintro.setPhone(request.getParameter("phone"));
        orgintro.setService(request.getParameter("service"));
        orgintro.setTeam(request.getParameter("team"));

        organizationService.addOrganization(organization,orgintro);

        ModelAndView result = new ModelAndView("organizations");
        return result;
    }

    @RequestMapping(value = "/jsp/modifyOrg", method = RequestMethod.POST)
    public ModelAndView modifyOrg(HttpServletRequest request) throws UnsupportedEncodingException {
        request.setCharacterEncoding("UTF-8");
        Integer id = Integer.parseInt(request.getParameter("id"));
        OrganizationWithBLOBs organization = new OrganizationWithBLOBs();
        organization.setId(id);
        organization.setName(request.getParameter("name"));
        organization.setNumpeople(Integer.parseInt(request.getParameter("numPeople")));
        organization.setProvince(request.getParameter("province"));
        organization.setCity(request.getParameter("city"));
        organization.setDistrict(request.getParameter("district"));
        organization.setAbstract("xxx");
        organization.setIntroduce("xxx");
        OrgintroWithBLOBs orgintro = new OrgintroWithBLOBs();
        orgintro.setOrgId(id);
        orgintro.setAbstract(request.getParameter("abstract"));
        orgintro.setAddress(request.getParameter("address"));
        orgintro.setCourse(request.getParameter("course"));
        orgintro.setHardware(request.getParameter("hardware"));
        orgintro.setPhone(request.getParameter("phone"));
        orgintro.setService(request.getParameter("service"));
        orgintro.setTeam(request.getParameter("team"));

        organizationService.modifyOrganization(organization,orgintro);

        ModelAndView result = new ModelAndView("organizations");
        return result;
    }

    @RequestMapping(value = "/jsp/deleteOrg", method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> deleteOrg(@RequestParam("organizationId") Integer orgId) {
        organizationService.deleteOrganization(orgId);

        Map<String,Object> result = new HashMap<>();
        result.put("deleteOrgId",orgId);


        return result;
    }
}
