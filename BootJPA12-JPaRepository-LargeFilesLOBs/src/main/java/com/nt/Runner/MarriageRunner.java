package com.nt.Runner;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.Entity.MarriageSeeker;
import com.nt.Service.IMarriageManagmentService;
@Component
public class MarriageRunner implements CommandLineRunner{

	@Autowired
	private IMarriageManagmentService service;
	@Override
	public void run(String... args) throws Exception {
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter persion name::");
//		String name=sc.next();
//		System.out.println("Enter persion address::");
//		String addrs=sc.next();		
//		System.out.println("Enter persion photo file complete path::");
//		String photopath=sc.next();		
//		System.out.println("Enter persion biadata file complete path::");
//		String biodata=sc.next();	
//		System.out.println("is the persion Indian?");
//		boolean indian=sc.hasNextBoolean();
//		
//		//prepare byte[] represinting photo file content
//		InputStream is=new FileInputStream(photopath);
//		byte[] photoData=new byte[is.available()];
//		photoData=is.readAllBytes();
//	    
//		//prepare char[] representing bigdata file content
//		File file=new File(biodata);
//		Reader reader=new FileReader(file);
//		char bioDataContent[]=new char[(int)file.length()];
//		reader.read(bioDataContent);
//		
//		//prepare entity class obj
//		MarriageSeeker seeker=new MarriageSeeker();
//		seeker.setName(name);
//		seeker.setAddrs(addrs);
//		seeker.setDob(LocalDateTime.of(1990, 12,23,2,24));
//		seeker.setPhoto(photoData);
//		seeker.setBiodata(bioDataContent);
//		seeker.setIndian(indian);
//		System.out.println(service.registerMarriageSeeker(seeker));
		
		Optional<MarriageSeeker> opt=service.searchSeekerById(1L);
		if(opt.isPresent()) {
			MarriageSeeker seeker=opt.get();
			System.out.println(seeker.getId()+" "+seeker.getName()+" "+seeker.getAddrs()+" "+seeker.getIndian());
			
			OutputStream os=new FileOutputStream("retrive_photo.gfif");
			os.write(seeker.getPhoto());
			os.flush();
			Writer writer=new FileWriter("retrive_biadata.txt");
			writer.write(seeker.getBiodata());
			writer.flush();
			os.close();
			writer.close();
			System.out.println("LOBs are retreived");
		}
		else {
			System.out.println("Lobs are not retrived");
		}
	}

}
