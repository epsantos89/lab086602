package br.univel.servlet;


import java.io.IOException;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.jms.JMSContext;
import javax.jms.JMSDestinationDefinition;
import javax.jms.JMSDestinationDefinitions;
import javax.jms.ObjectMessage;
import javax.jms.Queue;
import javax.jms.Topic;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Config
 */
@JMSDestinationDefinitions(
	    value = {
	        @JMSDestinationDefinition(
	            name = "java:/queue/QueuePedido",
	            interfaceName = "javax.jms.Queue",
	            destinationName = "QueuePedido"
	        ),
	        @JMSDestinationDefinition(
	            name = "java:/topic/TopicVenda",
	            interfaceName = "javax.jms.Topic",
	            destinationName = "TopicVenda"
	        )
	    })

@WebServlet("/config")
public class Config extends HttpServlet {


	private static final long serialVersionUID = -31203511006466680L;


	 @Inject
	    private JMSContext context;

	    @Resource(lookup = "java:/queue/QueuePedido")
	    private Queue queue;

	    @Resource(lookup = "java:/topic/TopicVenda")
	    private Topic topic;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public Config() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request,
						HttpServletResponse response) throws ServletException, IOException {



		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}



}
