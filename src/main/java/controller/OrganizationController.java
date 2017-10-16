package controller;

import model.OrganizationWithBLOBs;
import model.OrganizationviewWithBLOBs;
import model.OrgintroWithBLOBs;
import org.apache.ibatis.annotations.Param;
import org.springframework.http.HttpRequest;
import org.springframework.security.access.annotation.Secured;
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
    public ModelAndView toOrganization() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("organizations");
        mv.addObject("organizations", organizationService.getAllOrganizationsFromView());
        return mv;
    }

    @RequestMapping(value = "/jsp/getSingleOrg", method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> getSingleOrg(@RequestParam("organizationId") Integer orgId) {
        Map<String,Object> result = new HashMap<>();
        result.put("org",organizationService.getOrganizationById(orgId));
        result.put("orgintro",organizationService.getOrgintroById(orgId));
        return result;
    }

    @RequestMapping(value = "/jsp/org_modify")
    public ModelAndView toOrgModify(@RequestParam("organizationId") Integer orgId) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("org_modify");
        OrgintroWithBLOBs orgintroWithBLOBs = organizationService.getOrgintroById(orgId);
        mv.addObject("org",organizationService.getOrganizationById(orgId));
        mv.addObject("orgintro",orgintroWithBLOBs);
        if (orgintroWithBLOBs != null && orgintroWithBLOBs.getAbstract() != null && !orgintroWithBLOBs.getAbstract().isEmpty())
            mv.addObject("orgintroAb",orgintroWithBLOBs.getAbstract());
        return mv;
    }

    @RequestMapping(value = "/jsp/org_add")
    public String toOrgAdd() {
        return "org_add";
    }

    @RequestMapping(value = "/jsp/addOrg", method = RequestMethod.POST)
    @ResponseBody
    public Map addOrg(OrganizationWithBLOBs org, OrgintroWithBLOBs orgintro, HttpServletRequest request) throws UnsupportedEncodingException {

        if (org != null && orgintro != null){
            org.setAbstract(request.getParameter("abstract"));
            org.setAbstract("xxx");
            org.setIntroduce("xxx");
            orgintro.setAbstract(request.getParameter("abstract"));
            System.out.println("==========  controller Add!!!");
            organizationService.addOrganization(org,orgintro);
        }

        return null;
    }

    @RequestMapping(value = "/jsp/modifyOrg", method = RequestMethod.POST)
    @ResponseBody
    public Map modifyOrg(OrganizationWithBLOBs org, OrgintroWithBLOBs orgintro, HttpServletRequest request) throws UnsupportedEncodingException {

        System.out.println("===============     modify controller");
        Integer id = Integer.parseInt(request.getParameter("organizationId"));
        if (org != null && orgintro != null){
            org.setId(id);
            org.setAbstract(request.getParameter("abstract"));
            org.setAbstract("xxx");
            org.setIntroduce("xxx");
            orgintro.setOrgId(id);
            orgintro.setAbstract(request.getParameter("abstract"));
            organizationService.modifyOrganization(org,orgintro);
        }

        return null;
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
