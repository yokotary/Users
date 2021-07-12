package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	/**
	 * 全件検索
	 * @return ユーザーリスト List<User>
	 */
	public List<User> findAll() {
		return repository.findAll();
	}

	/**
	 * IDを指定してレコードを読み込む
	 * @param id Long
	 * @return 指定したレコード Optional<User>
	 */
	public Optional<User> findById(Long id) {
		return repository.findById(id);
	}

	/**
	 * IDを指定してレコードを削除する
	 * @param id Long
	 */
	public void deleteById(Long id) {
		repository.deleteById(id);
	}

	/**
	 * 追加・修正する
	 * @param user
	 */
	public void save(User user) {
		repository.save(user);
	}

	/**
	 * 名前を指定して検索
	 * @param name
	 * @return
	 */
	public List<User> findByName(String name) {
		return repository.findBynameContaining(name);
	}

	/**
	 * 誕生日で検索
	 * @param birth
	 * @return
	 */
	public List<User> findByBirth(LocalDate start, LocalDate end) {
		return repository.findByBirthBetween(start, end);
	}
}
